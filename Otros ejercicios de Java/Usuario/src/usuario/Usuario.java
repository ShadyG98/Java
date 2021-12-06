package usuario;

import java.util.Scanner;

/**
 * @author Brenda Giselle Escobar
 */
public class Usuario {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
//Declaración
        String usuario = "admin";
        int clave = 123;
        int contador = 0;

        System.out.println("Bienvenido al sistema:\nIngrese su nombre de usuario y contraseña ");
        usuario = consola.nextLine();
        clave = Integer.parseInt(consola.nextLine());
//Estructura de condiciones para hacer la validación
        if (usuario.equals("admin") && clave == 123) {
            System.out.println("Bienvenido, administrador");
        } else {
            do {
                if (contador == 2) {
                    System.out.println("Usuario bloqueado");
                    break;
                } else {
                    contador++;
                    System.out.println("Contraseña incorrecta " + (2 - contador) + " Intentos restantes ");
                    usuario = consola.nextLine();
                    clave = Integer.parseInt(consola.nextLine());
                }

            } while (!(usuario.equals("admin") && clave == 123));
        }
    }
}
