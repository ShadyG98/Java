package diamesnumero;

import java.util.Scanner;
/*
 * @author Brenda Giselle Escobar
 */
public class DiaMesNumero {
   
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int dia, numero, mes, NumeroMaximo = 0;
        do {
            System.out.println("Ingrese el numero del mes del año: ");
            mes = Integer.parseInt(consola.nextLine());

        } while (!(mes >= 1 || mes <= 12));

        do {
            System.out.println("Ingrese el Numero del dia del mes: ");
            numero = Integer.parseInt(consola.nextLine());
        } while (!(numero > 1 || numero < NumeroMaximo));

        do {
            System.out.println("Ingrese el numero del dia de la semana: ");
            dia = Integer.parseInt(consola.nextLine());
        } while (!(dia > 1 || dia < 7));

        //Mes
        String Cadena_mes = " ";
        switch (mes) {
            case 1:
                Cadena_mes = "Enero";
                break;

            case 2:
                Cadena_mes = "Febrero";
                break;

            case 3:
                Cadena_mes = "Marzo";
                break;

            case 4:
                Cadena_mes = "Abril";
                break;

            case 5:
                Cadena_mes = "Mayo";
                break;

            case 6:
                Cadena_mes = "Junio";
                break;

            case 7:
                Cadena_mes = "Julio";
                break;

            case 8:
                Cadena_mes = "Agosto";
                break;
            case 9:
                Cadena_mes = "Septiembre";
                break;
            case 10:
                Cadena_mes = "Octubre";
                break;
            case 11:
                Cadena_mes = "Noviembre";
                break;
            case 12:
                Cadena_mes = "Diciembre";
                break;
        }

        //Dia de la semana
        String dia_mes = " ";
        switch (dia) {
            case 1:
                dia_mes = "Lunes";
                break;

            case 2:
                dia_mes = "Martes";
                break;

            case 3:
                dia_mes = "Miercoles";
                break;

            case 4:
                dia_mes = "Jueves";
                break;

            case 5:
                dia_mes = "Viernes";
                break;
        }

        //Numero 
        switch (mes) {
            case 2:
                NumeroMaximo = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                NumeroMaximo = 30;
                break;
            default:
                NumeroMaximo = 31;
                break;
        }

        System.out.println(dia_mes + " " + numero + " " + "de " + Cadena_mes);
    }
}
