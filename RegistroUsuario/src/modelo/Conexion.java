package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {
    public static final String URL = "jdb:mysql://localhost:3306/usuarios?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "";
    
    public Connection getConnection(){
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL,usuario,contraseña);
        } catch (Exception e) {
            System.err.println("Error, "+e);
        }
        return conexion;
    }
}
