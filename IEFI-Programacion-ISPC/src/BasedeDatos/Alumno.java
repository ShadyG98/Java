package BasedeDatos;

public class Alumno {
    private int id_alumno;
    private String nombre;
    private String apellido;
    private int DNI;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    public Alumno(int id_alumno, String nombre, String apellido, int DNI) {
        this.id_alumno = id_alumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }
    
    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Alumno {" + "Id Alumno: " + id_alumno + ", Nombre: " + nombre + ", Apellido: " + apellido + ", DNI: " + DNI + '}';
    }  
}
