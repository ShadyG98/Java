package Logica;

import BasedeDatos.*;
import java.util.*;

public class PruebaMain {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner in = new Scanner(System.in);
        try {

            Sistema sis = new Sistema();

            //Actividad 1 ingresar los nombres de los habitantes del grupo
            Alumno ds = new Alumno("Diego", "Silva", 40901951);
            sis.agregar_Alumno(ds);
            Alumno jl = new Alumno("Juan", "Lopez", 36125641);
            sis.agregar_Alumno(jl);
            Alumno ma = new Alumno("Monica", "Antich", 22372208);
            sis.agregar_Alumno(ma);
            Alumno im = new Alumno("Ivan", "Massimino", 41711400);
            sis.agregar_Alumno(im);
            Alumno be = new Alumno("Brenda", "Escobar", 41482506);
            sis.agregar_Alumno(be);

            //Se agrega un usuario llamado Juan Perez DNI: 123
            Alumno pruebaJuan = new Alumno("Juan", "Perez", 123);
            System.out.println("Se agrega el alumno: " + pruebaJuan.getNombre() + " | Apellido: " + pruebaJuan.getApellido() + " | DNI: " + pruebaJuan.getDNI());
            sis.agregar_Alumno(pruebaJuan);

            //Modificacion del usuario llamado Juan Perez DNI: 123 con el nuevo DNI: 456
            pruebaJuan.setDNI(456);
            pruebaJuan.setId_alumno(6);
            //Utilizamos el metodo de actualizar el nuevo Juan con nuevo DNI
            System.out.println("Se modifica el alumno con los datos: " + pruebaJuan.getNombre() + " | Apellido: " + pruebaJuan.getApellido() + " | DNI: " + pruebaJuan.getDNI());
            sis.actualizar_Alumno(pruebaJuan);
            //Elimino al Alumno generado  (En este caso es 5 por la cantidad de veces que hemos probado)
            System.out.println("Se Elimina el alumno: ");
            sis.borrar_Alumno(6);

            while(opcion != 5){
                
                System.out.println("" 
                + "\nBienvenido a nuestro gestor de alta, baja y modificacion de Alumnos"
                + "\nIngrese 1 para Consultar datos o registros de Alumnos en la base de datos"
                + "\nIngrese 2 para Registrar datos o registros de un nuevo Alumno"
                + "\nIngrese 3 para Eliminar datos o registros de un Alumno existente"
                + "\nIngrese 4 para Modificar datos o registros de un Alumno por ID´s"
                + "\nIngrese 5 para Salir");
               
                opcion = in.nextInt();
                switch(opcion){
                    case 1:
                            sis.devolver_todo();
                        break;
                    case 2:
                        
                        System.out.println("Ingresar nombre para el Alumno");
                        String nombre = in.next();
                        System.out.println("Ingresar apellido para el Alumno");
                        String apellido = in.next();
                        System.out.println("Ingresar DNI para el Alumno");
                        int dni = in.nextInt();
                        Alumno agregar = new Alumno(nombre, apellido, dni);
                        sis.agregar_Alumno(agregar);
                        
                        break;
                    case 3:
                        
                        System.out.println("Ingrese el Id del Alumno que desea eliminar");
                        int id = in.nextInt();
                        sis.borrar_Alumno(id);
                        
                        break;
                    case 4:
                        
                        System.out.println("Ingresar nombre para la modificacion de Alumno");
                        String nModificar = in.next();
                        System.out.println("Ingresar apellido para el Alumno");
                        String aModificar = in.next();
                        System.out.println("Ingresar DNI para el Alumno");
                        int dniMod = in.nextInt();
                        System.out.println("Ingrese el ID del Alumno a modificar");
                        int Id = in.nextInt();
                        Alumno actualizar = new Alumno(Id, nModificar, aModificar, dniMod);
                        sis.actualizar_Alumno(actualizar);
                        
                        break;
                    case 5:
                        
                        System.out.println("Gracias por usar este servicio");
                        
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;
                }
            }
                
        } catch (Exception e) {
            System.out.println("Error de lectura de carga de base de datos");
            e.printStackTrace(System.out);
        }
    }
}
