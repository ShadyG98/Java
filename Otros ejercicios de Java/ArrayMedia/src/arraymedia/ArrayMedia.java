package arraymedia;

import java.util.Scanner;

/**
 * @author Brenda Giselle Escobar
 */
public class ArrayMedia {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        int i = 0, auxiliar = 0;
        int arreglo[] = new int[5];

        System.out.println("Ingrese un total de 5 numeros y serán calculados por la media: ");
        for (int a = 0; a < 5; a++) {
            arreglo[a] = consola.nextInt();
        }

        while (i < 5) {

            auxiliar += arreglo[i++];
            // Manera tradicional para entenderlo mejor
            // auxiliar = arreglo[i] + auxiliar;
            //   i++;
        }
        auxiliar = auxiliar / 5;

        System.out.println("la media total es: " + auxiliar);
    }
}
