package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.ConsultasProducto;
import modelo.Producto;
import vista.Inventario;

public class CtrlProducto implements ActionListener {

    private Producto mod;
    private ConsultasProducto modC;
    private Inventario inv;

    public CtrlProducto(Producto mod, ConsultasProducto modC, Inventario inv) { //Controlador del inventario
        this.mod = mod;
        this.modC = modC;
        this.inv = inv;
        this.inv.btnAlta.addActionListener(this);
        this.inv.btnActualiza.addActionListener(this);
        this.inv.btnEliminar.addActionListener(this);
        this.inv.btnLimpiar.addActionListener(this);        

    }

    public void iniciar() {
        inv.setTitle("Visualizando el inventario");
        inv.setLocationRelativeTo(null);
        inv.txtId.setVisible(false);
        //inv.lblVista1.setVisible(false);
        RegistrosTabla();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*Obtengo de la clase Producto el setter de cada elemento, y con el getter obtengo los datos*/
 /*inv = frm de inventario, <elemento>, getText() obtengo */
        if (e.getSource() == inv.btnAlta) {
            if (inv.txtCodigo.getText().isEmpty() || inv.txtNombre.getText().isEmpty() || inv.txtModelo.getText().isEmpty() || inv.txtMarca.getText().isEmpty() || inv.txtPrecio.getText().isEmpty() || inv.txtDescripcion.getText().isEmpty() || inv.txtSrc.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, llena todos los campos antes de presionar Guardar", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                mod.setCodigo(inv.txtCodigo.getText());
                mod.setNombre(inv.txtNombre.getText());
                mod.setModelo(inv.txtModelo.getText());
                mod.setMarca(inv.txtMarca.getText());
                mod.setPrecio(Double.parseDouble(inv.txtPrecio.getText()));
                mod.setTipo(inv.cbTipo.getSelectedItem().toString());
                mod.setExistencia(Integer.parseInt(inv.spExistencias.getValue().toString()));
                mod.setDescripcion(inv.txtDescripcion.getText());
                /*en todos los mod.set<nombre> que son del tipo String, la obtención de su información es "directa"*/
 /*en el caso de los tipo entero y decimal deben ser convertidos (parse int)*/
 /*Por otro lado, para guardar la imagen se debe hacer la siguiente conversión:*/
                try {
                    //Declaro la variable 'ruta' como tipo file y le digo que valdrá lo que contenga la variable ruta dentro del txtSrc y obtengo lo que hay dentro
                    File ruta = new File(inv.txtSrc.getText());
                    //Declaro la variable 'icono' como tipo byte[] y le digo que valdrá (en tamaño) lo que valga la ruta aunado a su largo (length)
                    byte[] icono = new byte[(int) ruta.length()];
                    //Declaro la variable 'input' como tipo InputStream (flujo de datos) y le digo que valdrá lo que valga ruta.
                    InputStream input = new FileInputStream(ruta);
                    input.read(icono); //leo lo que contenga la variable icono
                    mod.setImagen(icono); //Finalmente como terminó la conversión  setteo los bytes que se guardaron en 'icono' para la BD                
                } catch (IOException o) {
                    mod.setImagen(null);
                }

                if (modC.registrar(mod)) {
                    JOptionPane.showMessageDialog(null, "Registro guardado");
                    limpiar();
                    RegistrosTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                    limpiar();
                    RegistrosTabla();
                }
            }
        }

        if (e.getSource() == inv.btnActualiza) {
            if (inv.txtCodigo.getText().isEmpty() || inv.txtNombre.getText().isEmpty() || inv.txtModelo.getText().isEmpty() || inv.txtMarca.getText().isEmpty() || inv.txtPrecio.getText().isEmpty() || inv.txtDescripcion.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Primero selecciona un registro de la tabla que deseas modificar y luego presiona Actualizar", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                if (inv.txtSrc.getText().isEmpty()) {
                    /**/ //Si lo que alberga la cadena inv.temporal.equals("") inv.txtBytes.getText().isEmpty()inv.txtBytes.getText().equals("")
                    mod.setId(Integer.parseInt(inv.txtId.getText()));
                    mod.setCodigo(inv.txtCodigo.getText());
                    mod.setNombre(inv.txtNombre.getText());
                    mod.setModelo(inv.txtModelo.getText());
                    mod.setMarca(inv.txtMarca.getText());
                    mod.setPrecio(Double.parseDouble(inv.txtPrecio.getText()));
                    mod.setTipo(inv.cbTipo.getSelectedItem().toString());
                    mod.setExistencia(Integer.parseInt(inv.spExistencias.getValue().toString()));
                    mod.setDescripcion(inv.txtDescripcion.getText());

                    if (modC.modificarSin(mod)) {
                        JOptionPane.showMessageDialog(null, "Datos actualizados");
                        limpiar();
                        RegistrosTabla();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Datos no actualizados");
                        limpiar();
                        RegistrosTabla();
                    }

                } else {
                    mod.setId(Integer.parseInt(inv.txtId.getText()));
                    mod.setCodigo(inv.txtCodigo.getText());
                    mod.setNombre(inv.txtNombre.getText());
                    mod.setModelo(inv.txtModelo.getText());
                    mod.setMarca(inv.txtMarca.getText());
                    mod.setPrecio(Double.parseDouble(inv.txtPrecio.getText()));
                    mod.setTipo(inv.cbTipo.getSelectedItem().toString());
                    mod.setExistencia(Integer.parseInt(inv.spExistencias.getValue().toString()));
                    mod.setDescripcion(inv.txtDescripcion.getText());
                    try {
                        File ruta = new File(inv.txtSrc.getText());
                        byte[] icono = new byte[(int) ruta.length()];
                        InputStream input = new FileInputStream(ruta);
                        input.read(icono);
                        mod.setImagen(icono);
                    } catch (IOException o) {
                        mod.setImagen(null);
                    }

                    if (modC.modificar(mod)) {
                        JOptionPane.showMessageDialog(null, "Registro actualizado");
                        limpiar();
                        RegistrosTabla();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al actualizar");
                        limpiar();
                        RegistrosTabla();
                    }

                }

            }
            inv.btnAlta.setEnabled(true);
        }

        if (e.getSource() == inv.btnEliminar) {
            if (inv.txtCodigo.getText().isEmpty() || inv.txtNombre.getText().isEmpty() || inv.txtModelo.getText().isEmpty() || inv.txtMarca.getText().isEmpty() || inv.txtPrecio.getText().isEmpty() || inv.txtDescripcion.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Primero selecciona un registro de la tabla que deseas eliminar y luego presiona Eliminar", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                int delete = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar este producto?", "Pregunta", JOptionPane.ERROR_MESSAGE, JOptionPane.YES_NO_OPTION);

                if (delete == JOptionPane.YES_OPTION) {

                    mod.setId(Integer.parseInt(inv.txtId.getText()));

                    if (modC.eliminar(mod)) {
                        JOptionPane.showMessageDialog(null, "Registro eliminado");
                        limpiar();
                        RegistrosTabla();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar");
                        limpiar();
                        RegistrosTabla();
                    }
                }
            }
        }

        if (e.getSource() == inv.btnLimpiar) {
            limpiar();
        }      
       

    }

    public void limpiar() {
        inv.txtCodigo.setText(null);
        inv.txtNombre.setText(null);
        inv.txtModelo.setText(null);
        inv.txtMarca.setText(null);
        inv.txtPrecio.setText(null);
        inv.cbTipo.setSelectedItem("- -");
        inv.spExistencias.setValue(1);
        inv.txtDescripcion.setText(null);
        inv.txtSrc.setText(null);
        inv.lblVista.setIcon(null);
        //inv.lblVista.removeAll();
        //inv.lblVista.repaint();
        inv.btnAlta.setEnabled(true);
    }
    
 
    public void RegistrosTabla() {
        //CARGA AUTOMATICA DE REGISTROS
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            inv.tblProductos.setModel(modelo);

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

}
