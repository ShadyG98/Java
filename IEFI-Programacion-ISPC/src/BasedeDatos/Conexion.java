package BasedeDatos;

import java.sql.*;

public class Conexion {
    
    public static Connection conexion;
    public static String link = "jdbc:mysql://localhost/IEFI?serverTimezone=UTC";

    public static Connection darConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            if(conexion == null){
                conexion = DriverManager.getConnection(link, "root", "");
            }            
        } catch (Exception e) {
            System.out.println("Error de carga");
            e.printStackTrace(System.out);
        }
        return conexion;
    }
    
}
