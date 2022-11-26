//ESTA CLASE CONTIENE LAS LLAMADAS A LA BASE DE DATOS
package modelo;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class ConsultasProducto extends Conexion {
    //Recibo el modelo producto y la variable que pasa como parámetro es "prod"

    public boolean registrar(Producto prod) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO inventario (codigo, nombre, modelo, marca, precio, tipo, existencia, descripcion, imagen) VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql); //preparo la insercion guardada en la variable sql
            ps.setString(1, prod.getCodigo());
            ps.setString(2, prod.getNombre());
            ps.setString(3, prod.getModelo());
            ps.setString(4, prod.getMarca());
            ps.setDouble(5, prod.getPrecio());
            ps.setString(6, prod.getTipo());
            ps.setInt(7, prod.getExistencia());
            ps.setString(8, prod.getDescripcion());
            ps.setBytes(9, prod.getImagen());
            ps.execute();
            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close(); //Cierro conexion
            } catch (Exception e) {
                System.err.println(e);
            }
        }

    }

    public boolean modificar(Producto prod) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE inventario SET codigo=?, nombre=?, modelo=?, marca=?, precio=?, tipo=?, existencia=?, descripcion=?, imagen=? WHERE id=?";

        try {
            ps = con.prepareStatement(sql); //preparo la insercion guardada en la variable sql
            ps.setString(1, prod.getCodigo());
            ps.setString(2, prod.getNombre());
            ps.setString(3, prod.getModelo());
            ps.setString(4, prod.getMarca());
            ps.setDouble(5, prod.getPrecio());
            ps.setString(6, prod.getTipo());
            ps.setInt(7, prod.getExistencia());
            ps.setString(8, prod.getDescripcion());
            ps.setBytes(9, prod.getImagen());
            ps.setInt(10, prod.getId());
            ps.execute();
            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close(); //Cierro conexion
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }

    public boolean modificarSin(Producto prod) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE inventario SET codigo=?, nombre=?, modelo=?, marca=?, precio=?, tipo=?, existencia=?, descripcion=? WHERE id=?";

        try {
            ps = con.prepareStatement(sql); //preparo la insercion guardada en la variable sql
            ps.setString(1, prod.getCodigo());
            ps.setString(2, prod.getNombre());
            ps.setString(3, prod.getModelo());
            ps.setString(4, prod.getMarca());
            ps.setDouble(5, prod.getPrecio());
            ps.setString(6, prod.getTipo());
            ps.setInt(7, prod.getExistencia());
            ps.setString(8, prod.getDescripcion());
            ps.setInt(9, prod.getId());
            ps.execute();
            return true;

        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close(); //Cierro conexion
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }

    public boolean eliminar(Producto prod) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM inventario WHERE id=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, prod.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }
        }

    }

}
