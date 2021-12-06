package BasedeDatos;

import java.sql.*;

public class Sistema {

    public void agregar_Alumno(Alumno nuevo) {
        try {
            Connection conec = Conexion.darConexion();

            PreparedStatement sentencia = conec.prepareStatement("INSERT INTO Alumnos (nombre, apellido, DNI) VALUES (?,?,?)");

            sentencia.setString(1, nuevo.getNombre());
            sentencia.setString(2, nuevo.getApellido());
            sentencia.setInt(3, nuevo.getDNI());
            
            sentencia.executeUpdate();
        } catch (SQLException e) {
           e.printStackTrace(System.out);
        }
    }

    public void borrar_Alumno(int borrar_id) {

        try {
            Connection conec = Conexion.darConexion();

            PreparedStatement sentencia = conec.prepareStatement("DELETE FROM Alumnos WHERE id_alumno = ?");

            sentencia.setInt(1, borrar_id);

            System.out.println("Elemento eliminado");

             sentencia.executeUpdate();
             
        } catch (SQLException e) {
            System.out.println("Error en la carga de la base de datos");
        }
    }

    public void actualizar_Alumno(Alumno nuevo) {

        try {
            Connection conec = Conexion.darConexion();

            PreparedStatement sentencia = conec.prepareStatement("UPDATE Alumnos SET nombre = ?, apellido = ?, DNI = ? WHERE id_alumno = ?");

            sentencia.setString(1, nuevo.getNombre());
            sentencia.setString(2, nuevo.getApellido());
            sentencia.setInt(3, nuevo.getDNI());
            sentencia.setInt(4, nuevo.getId_alumno());

            System.out.println("Actualizado");

             sentencia.executeUpdate();
             
        } catch (SQLException e) {
            System.out.println("Error en la carga de la base de datos");
        }
    }

    public void devolver_todo() {
        try {
            Connection conec = Conexion.darConexion();

            PreparedStatement sentencia = conec.prepareStatement("SELECT * FROM Alumnos");

            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                System.out.print("ID: " + resultado.getInt("id_alumno"));
                System.out.println(" | Nombre: " + resultado.getString("nombre"));
                System.out.println("Apellido: " + resultado.getString("apellido"));
                System.out.println("DNI: " + resultado.getInt("DNI"));
                System.out.println("");

            }
           

        } catch (SQLException e) {
            System.out.println("Error en la carga de la base de datos");
        }
    }
}
