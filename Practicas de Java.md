# Java
Ejercicios de Java

import java.util.Scanner;

public class UniversidadDeJava {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
       
        
        }
    }
/*
Resumen seccion 1 y 2
public class UniversidadDeJava {

    public static void main(String[] args) {
        //Definimos la variable
        int MiVariableEntera=10;
        //Modificamos el valor de la variable
        MiVariableEntera=5;
           System.out.println(MiVariableEntera);
           
        String MiVariableCadena = "Saludos";
        System.out.println(MiVariableCadena);
        
        MiVariableCadena= "Adios";
        System.out.println(MiVariableCadena);
        
        //Var va a ser inferencia de tipos en Java
        var MiVariableEntera2 = 10;
        System.out.println(MiVariableEntera2);
        String MiVariableCadena2 = ("Nueva cadena");
        System.out.println("MiVariableCadena2 =" + MiVariableCadena2);
        
        var mivariable = 1;
        var $mivariable =2;
        var _mivariable= 3;
        
        // var mivaríable= 3; no se recomienda usar, tampoco # 
        
    }
}
 */
// --------------------------------------------------------------------------------------------------
// Seccion 2
/*
public class UniversidadDeJava {
    public static void main(String[] args) {
        var usuario= "Juan";
        var titulo= "ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("Union: " + union);

        var i=3;
        var j=4;
        System.out.println(i +j); //no usar acentos
        System.out.println(i +j + usuario);
        System.out.println(usuario + i + j); //no hace la suma, lo toma como cadena
        System.out.println(usuario + (i+j)); //Aqui si hace la suma
        
    }
}
*/
//
/*
public class UniversidadDeJava {
    public static void main(String[] args) {
        var nombre= "Karla";
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabuladot: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Retroceso: \b\b" + nombre);
        System.out.println("Retroceso: \b\b\b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \" " + nombre + "\""); // ambas comillas cierran la cadena
    }
}
*/

/*
import java.util.Scanner;

import org.xml.sax.ext.LexicalHandler;

public class UniversidadDeJava {
    public static void main(String[] args) {
        System.out.println("Escribe el nombre: ");
        Scanner consola = new Scanner(System.in);

        var usuario= consola.nextLine();
        System.out.println("Usuario: " + usuario);
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " "+ usuario);
    }
}
*/

/* Ejercicio Libros:

import java.util.Scanner;
public class UniversidadDeJava {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Proporcione el titulo: ");
        var titulo= consola.nextLine();
        System.out.println("titulo " + titulo);

        System.out.println("Proporcione el autor: ");
        var autor= consola.nextLine();
        System.out.println("Autor " + autor);

        System.out.println(titulo + " fue escrito por "+ autor);
    }
}

// --------------------------------------------------------------------------------------------------
// Seccion 3

/*
Ejercicio de literales
import java.util.Scanner;
public class UniversidadDeJava {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        // Tipos primitivos entero: byte, short, int, long
        byte numerobyte = (byte) 129; // En esta ocasion, 129 excede pero lo forzamos a covertirlo en byte
        System.out.println("Valor numerobyte: " + numerobyte);
        System.out.println("Valor minimo de byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo de byte: " + Byte.MAX_VALUE);

        short numeroshort = (short) 32768;
        System.out.println("Valor numeroshort: " + numeroshort);
        System.out.println("Valor minimo de short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo de short: " + Short.MAX_VALUE);

        // int numeroint =(int) 2147483648; En esta ocasion no es posible convertir int
        int numeroint =(int) 2147483648L; //colocamos la L, que es una literal de tipo Long
        System.out.println("Valor minimo de numeroint: " + numeroint);
        System.out.println("Valor minimo de short: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo de short: " + Integer.MAX_VALUE);

        
        Long numerolong = (long) 9223372036854775808D; //Double
        System.out.println("Valor numerolong: " + numerolong);
        System.out.println("Valor minimo de Long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo de Long: " + Long.MAX_VALUE);
    }
} 

/*
import java.util.Scanner;
public class UniversidadDeJava {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        // Tipos primitivos flotantes: float y double 

        float numerofloat = (float) 3.4028236E38D; //si sobrepasamos el valor, ya nos imprime infinity
        System.out.println("Valor numerofloat: " + numerofloat);
        System.out.println("Valor minimo de float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo de float: " + Float.MAX_VALUE);

        Double numerodouble = (double) 1.7976931348623157E308;
        System.out.println("Valor numerodouble: " + numerodouble);
        System.out.println("Valor minimo de double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo de double: " + Double.MAX_VALUE);
    }
}

*/

/* Caracteres unicode
import java.util.Scanner;
public class UniversidadDeJava {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        char micaracter = 'a';
        System.out.println("Imprimir caracter: "+ micaracter);

        char varchar = '\u0021'; //Cada caracter tiene un valor, podemos encontrarlos buscando unicode
        System.out.println("caracter: " + varchar);

        char varchardecimal = 33;
        System.out.println("Caracter: " + varchardecimal);

        char varcharsimbolo = '!';
        System.out.println("Caracter: " + varcharsimbolo);

            // Caracter de tipo unicode

        var varchar1 = '\u0021'; //Cada caracter tiene un valor, podemos encontrarlos buscando unicode
        System.out.println("caracter con var: " + varchar1);

        var varchardecimal1 = 33; //Aqui var se imprime con el caracter
        System.out.println("Caracter con var: " + varchardecimal1);

        var varcharsimbolo1 = '!';
        System.out.println("Caracter con var: " + varcharsimbolo1);

        int variableenterasimbolo = '!';
        System.out.println("Variable entera simbolo: " + variableenterasimbolo);

        int letra = 'A'; //Varia de mayuscula y minuscula el valor
        System.out.println("Letra A: " + letra);

    }
}
*/

/* Condicionales
import java.util.Scanner;
public class UniversidadDeJava {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        boolean varboolean = true;
        System.out.println("Valor: "+ varboolean);

        if (varboolean==true){
            System.out.println("La bandera es verdadera");
        }
        else{
            System.out.println("La bandera es falsa");
        }

        var edad= 30;
        // var esadulto = edad >=18;
       // System.out.println("La edad del adulto es es mayor? " + esadulto);
        if (edad>=18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }
    }
}
*/

/*
import java.util.Scanner;
public class UniversidadDeJava {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        // convertir tipo string a un tipo int

        var edad = Integer.parseInt("20");
        var edad1= "20";
        System.out.println("Imprimir edad: " + (edad +1));
        System.out.println("Imprimir edad: " + (edad1 +1)); //20 concatenado 1, 201

        var valorPI = Double.parseDouble("3.1416");
        System.out.println(valorPI);

        //pedir valor

        System.out.println("Proporciona tu edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("Variable edad: " + edad);

        var edadtexto = String.valueOf(10); // Devuelve 10, pero string
        System.out.println("Edad texto: " + edadtexto);

        var caracter = "Hola".charAt(0); //Devuelve el caracter especifico
       // System.out.println("Caracter: " + caracter);

        System.out.println("Proporciona un caracter: ");
        caracter = consola.nextLine().charAt(0);
        System.out.println("Caracter: " + caracter);
    }
}
*/

/* Ejercicio Tienda de Libros
import java.util.Scanner;
public class UniversidadDeJava {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
       
        System.out.println("Bienvenido a la tienda de libros: ");

        String nombre;
        int id;
        double precio;
        boolean envio;

        
        System.out.println("Proporcione el nombre del libro: ");
        nombre = consola.nextLine();

        System.out.println("Proporcione el ID del libro: ");
        id = Integer.parseInt(consola.nextLine());

        System.out.println("Proporcione el precio: $");
        precio = Double.parseDouble(consola.nextLine());

        System.out.println("Escriba True o False ");
        envio = Boolean.parseBoolean(consola.nextLine());

        System.out.println(nombre + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio gratuito:" + envio);
    }
}
*/

/*
    import java.util.Scanner;
     
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Proporciona el nombre:");
            String nombre = scanner.nextLine();
            System.out.println("Proporciona el id:");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Proporciona el precio:");
            double precio = Double.parseDouble(scanner.nextLine());
            System.out.println("Proporciona el envio gratuito:");
            boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
     
            System.out.println(nombre + " #" + id);
            System.out.println("Precio: $" + precio);
            System.out.println("Envio Gratuito: " + envioGratuito);
        }
    }
*/

/*
import java.util.Scanner;
public class UniversidadDeJava {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
       
        int altura, ancho, perimetro, area;
        

        System.out.println("Proporcione la altura: ");
        altura = consola.nextInt();
        System.out.println("Proporcione el ancho: ");
        ancho = consola.nextInt();

        area = altura *ancho;
        perimetro = (altura + ancho) * 2;
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
    }
}

/* Eejercicio rectangulo
import java.util.Scanner;
public class UniversidadDeJava {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
       
        int altura, ancho, perimetro, area;   
 
        System.out.println("Proporcione la altura: ");
        altura = consola.nextInt();
        System.out.println("Proporcione el ancho: ");
        ancho = consola.nextInt();
 
        area = altura *ancho;
        perimetro = (altura + ancho) * 2;
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
    }
}

/* Ejercicio numero mayor menor
import java.util.Scanner;
public class UniversidadDeJava {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
       
        int primerNumero, segundoNumero;
        

        System.out.println("Ingrese el primer numero: ");
        primerNumero = consola.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        segundoNumero = consola.nextInt();

        System.out.println("El mayor de los dos numeros es: ");
        if (primerNumero > segundoNumero)
        {   
            
            System.out.println("El mayor numero es: " + primerNumero);
        }
        else{
            System.out.println("El mayor numero es:" + segundoNumero);
        }

    }
}
*/


/*
    import java.util.Scanner;
     
    public class Main {
     
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Proporciona el numero1:");
            int numero1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Proporciona el numero2:");
            int numero2 = Integer.parseInt(scanner.nextLine());
            System.out.println("El numero mayor es:");
            System.out.println(numero1 > numero2 ? numero1 : numero2);
        }
    }
*/

/*
import java.util.Scanner;
public class UniversidadDeJava {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
       
        var numero = 2;
        var numerotexto = "Valor desconocido";
        var mes = 1;
        var estacion = "estacion desconocida";

        switch (numero){

             case 1: 
             numerotexto = "Numero uno";
             break;

             case 2: 
             numerotexto = "Numero dos";
             break;

             case 3: 
             numerotexto = "Numero tres";
             break;

             case 4: 
             numerotexto = "Numero cuatro";
             break;

             default:
             numerotexto = "Caso no encontrado";
        }
        System.out.println("Numero: " + numero);

        switch (mes){
            case 1 : case 2 : case 12 :
            {
                estacion = "Invierno";
                break;
            }

            case 3 : case 4: case 5: 
            {
                estacion = "Primavera";
                break;
            }

            case 6 : case 7 : case 8 :
            {
                estacion = "Verano";
                break;
            }

            case 9 : case 10 : case 11:
            {
                estacion = "Otonio";
                break;
            }
        }
        
        System.out.println("Estacion: " + estacion);
    }
}
*/

/*
import java.util.Scanner;

public class UniversidadDeJava {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
       
        var numero = 0;

        numero = consola.nextInt();

                if(numero>=9 && numero<=10)
                {
                    System.out.println("A");
                }

                else if(numero>=8 && numero<9){
                    System.out.println("B");
                }

                else if(numero>=7 && numero<8){
                    System.out.println("C");
                }
                else if(numero>=6 && numero<7){
                    System.out.println("D");
                }
                else if(numero>=0 && numero<6){
                    System.out.println("F");
                }
                
                else System.out.println("Valor desconocido");
        }
    }
*/

/*
import java.util.Scanner;

public class UniversidadDeJava {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
       
        for ( var contador=0; contador <3; contador++){
            if(contador % 2!=0){
            continue;
            }
            
            System.out.println("Contador de for, numero: " + contador);
        }

        for ( var contador=0; contador <3; contador++){
            if(contador % 2==0){
            System.out.println("Contador de for, numero: " + contador);
            break;
            }
        }

        var contador = 0;
        do{
            System.out.println("Contador, numero: " + contador);
            contador ++;
        }
        while (contador <0);
        
        }
    }
/*
import java.util.Scanner;

public class UniversidadDeJava {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
       inicio: //Las etiquetas son para saltear pasos, como el going to, pero no es recomendable
        for ( var contador=0; contador <3; contador++){
            if(contador % 2!=0){
            continue inicio ;
            }
            
            System.out.println("Contador de for, numero: " + contador);
        }
    }
}

/* Clase Persona
public class Persona {

    String nombre;
    String apellido;
    
        public void desplegarinformacion ()
        {
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
        }
    
}
*/

/* Clase PruebaPersona
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarinformacion();

        Persona persona2 = new Persona();

        System.out.println("Persona 1: " + persona1);
        System.out.println("Persona 2: " + persona2);
        persona2.desplegarinformacion(); //no colocamos los atributos, por lo tanto, Null
        persona2.nombre = "Karla";
        persona2.apellido = "Lara";
        persona2.desplegarinformacion();
    }
}
*/
