package numeroprimo;

/**
 * @author Brenda Giselle Escobar
 */
import java.util.Scanner;

public class NumeroPar {

    public static void main(String[] args) {

        int numero = 1;
        int limite = 100;
        while (numero <= 100) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
