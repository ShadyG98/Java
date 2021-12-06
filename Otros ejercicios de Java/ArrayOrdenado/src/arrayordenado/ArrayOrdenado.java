package arrayordenado;

import java.util.Scanner;

/**
 * @author Brenda Giselle Escobar
 */
public class ArrayOrdenado {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        int i = 0, maximo = 0, minimo = 0;
        int arreglo[] = new int[8];

        System.out.println("Ingrese un total de 8 numeros y serán ordenados automáticamente: ");
        for (int a = 0; a < 8; a++) {
            arreglo[a] = consola.nextInt();
        }
        maximo = minimo = arreglo[0];

        for (int j = 0; j < 8; j++) {

            if (maximo < arreglo[j]) {
                maximo = arreglo[j];
            }

            if (minimo > arreglo[j]) {
                minimo = arreglo[j];
            }
        }

        System.out.println("Numero maximo:" + maximo + " Numero minimo:" + minimo);
    }
}
