package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {

        //Variables locales
        var a= 10;
        var b= 2;
        
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("Argumento a: " + aritmetica1.a);
        System.out.println("Argumento b: " + aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("Argumento a: " + aritmetica2.a);
        System.out.println("Argumento b: " + aritmetica2.b);

    }



    public void miMetodo(){
        System.out.println("miMetodo: ");
    }
}
/*
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();

        var resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado SumarConRetorno: " + resultado);

        resultado = aritmetica1.sumarConArgumentos(5,4);
        System.out.println("Resultado SumarConArgumento: " + resultado);
*/