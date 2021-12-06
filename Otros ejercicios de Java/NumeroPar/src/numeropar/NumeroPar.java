package numeropar;

/**
 * @author Brenda Giselle Escobar
 */
public class NumeroPar {

    public static void main(String[] args) {
//Los numeros pares del 1 al 100 con While
        int numero = 1;
        int limite = 100;
        System.out.println("Los numeros pares con While: ");
        while (numero <= 100) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
//Los numeros pares del 1 al 100 con Do While
        System.out.println("Los numeros pares con Do while: ");
        int cont = 1;
        do {
            if (cont % 2 == 0) {
                System.out.println(cont);
            }
            cont++;
        } while (cont <= 100);

//Los numeros pares del 1 al 100 con For
        System.out.println("Los numeros pares con For: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
