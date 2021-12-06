/*
jdbc:mysql://127.0.0.1:3306/?user=root
 */
package Conex;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * @author Shady
 */
public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javadb","usuario","12345");
        } catch (Exception e) {
            System.err.println("Error:" +e);
        }
    }
      public static void main(String[] args) {
        Conexion cn=new Conexion();
        Statement st;
        ResultSet rs;
        try {
            st=cn.con.createStatement();
            rs=st.executeQuery("select * from usuario");
            while (rs.next()) {                
                System.out.println(rs.getInt("id")+" " +rs.getString("user")+" " +rs.getString("dni"));
            }
            cn.con.close();
        } catch (Exception e) {
        }
    }
}