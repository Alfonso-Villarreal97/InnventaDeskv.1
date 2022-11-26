package modelo;
import java.sql.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    
    private final String base = "db_inv";
    private final String user = "root";
    private final String password = "root";
    private final String url = "jdbc:mysql://localhost:3306/db_inv?useSSL=false&serverTimezone=UTC" /*+ base*/;
    private Connection con = null; //Esta variable realiza la conexión, la guarda y la retorna
    
    public Connection getConexion(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(this.url, this.user, this.password);
            
            
        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
}
