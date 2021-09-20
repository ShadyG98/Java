package Operaciones;

public class Aritmetica {
    //Atributos de la clase

    int a;
    int b;

    //Constructor vacio

    public Aritmetica(){
        System.out.println("Constructor: ");
    }

    //Sobrecarga

    public Aritmetica (int arg1, int arg2){
        a= arg1;
        b= arg2;
        System.out.println("Constructor con argumentos: ");
    }

    //Metodo

    public void sumar(){
       int resultado = a + b;
       System.out.println("Valor de la suma: " + resultado);
    }

    public int sumarConRetorno(){
        //int resultado = a + b; es una manera
        //return resultado;
        return a + b;
    }

    public int sumarConArgumentos(int a, int arg2){
        this.a= a; //This es una variable que muestra exactamente en que lugar de la memoria está el argumento
        b= arg2; //Se puede utilizar para referenciar la ubicacion
        // return a + b; es una opcion
        return this.sumarConRetorno(); //This es muy util para saber que argumentos estan dentro de la clase
    }
}
