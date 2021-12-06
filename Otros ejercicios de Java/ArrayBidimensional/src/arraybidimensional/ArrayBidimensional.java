package arraybidimensional;

/**
 * @author Brenda Giselle Escobar
 */
public class ArrayBidimensional {

    public static void main(String[] args) {
        char matriz[][] = new char[5][5];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    System.out.print("X");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println("");
        }
    }
}
