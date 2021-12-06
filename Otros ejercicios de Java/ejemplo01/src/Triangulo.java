
/**
 * @author Brenda Giselle Escobar
 */
public class Triangulo {
    private int lado1, lado2, lado3;

    //GET
    public int obtenerLado1() {
        return lado1;
    }

    public int obtenerLado2() {
        return lado2;
    }
    
     public int obtenerLado3() {
        return lado3;
    }
     
    //SET
    public void modificarLado1(int lado1) {
        this.lado1 = lado1;
    }
    public void modificarLado2(int lado2) {
        this.lado2 = lado2;
    }

    public void modificarLado3(int lado3) {
        this.lado3 = lado3;
    }
    
    //Metodos
    public int calcularPerimetro(){
        return lado1 + lado2 +lado3;
    }
    
    public String determinarTipo(){
        
        //Determinar tipo de triangulo, equilatero
        if ((lado1==lado2) && (lado1==lado3)){
        return "Equilatero";
        }
        
        //Isosceles como segunda condicion
        else if((lado1==lado2) || (lado1==lado3 || lado2==lado3)){
        return "Isosceles";
        }
        
        //Escaleno, dado que ningun caso se cumpla
        else{
        return "Escaleno";
        }
    }
 }

