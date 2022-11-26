package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Action;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.ConsultasProducto;
import modelo.Producto;
import vista.Inventario;
import vista.Menu;

public class CtrlMenu implements ActionListener{

    private Producto mod;
    private ConsultasProducto modC;
    private Menu menu;
    private Inventario inv;

    public CtrlMenu(Producto mod, ConsultasProducto modC, Menu menu) {
        this.mod = mod;
        this.modC = modC;
        this.menu = menu;      
        
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == menu.btnGestionar){
           Inventario inven = new Inventario();
           inven.setVisible(true);       
       }
    }
    
    
    
    public void iniciar() {
        menu.setTitle("Innventa Desk© for Ingeniería Elevadores");
        menu.setLocationRelativeTo(null);
        RegistrosTabla();
        menu.txtFecha.setText(fechaActual());
    }    
    
     
  
    

    public void RegistrosTabla() {
        //CARGA AUTOMATICA DE REGISTROS
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            menu.tblProductos2.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();

            String sql = "SELECT codigo, nombre, modelo, marca, precio, tipo, existencia, descripcion FROM inventario";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            modelo.addColumn("Codigo");
            modelo.addColumn("Nombre");
            modelo.addColumn("Modelo");
            modelo.addColumn("Marca");
            modelo.addColumn("Precio (MXN)");
            modelo.addColumn("Tipo");
            modelo.addColumn("Existencia");
            modelo.addColumn("Descripción");
            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }

                modelo.addRow(filas);

            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }

    public static String fechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }

   


}
