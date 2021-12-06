
/**
 * @author Brenda Giselle Escobar
 */
public class Principal {
    public static void main(String[] args) {
        
    Cuadrado Cuad1 = new Cuadrado();
    Rectangulo Rect1 = new Rectangulo();
    Circulo Circ1= new Circulo();
    Triangulo Tria1 = new Triangulo();
    
    
    //Cuadrado
    Cuad1.modificarLado(4);
    
    System.out.println("El area del cuadrado es: " + Cuad1.calcularArea());
    System.out.println("El perimetro del cuadrado es: " + Cuad1.calcularPerimetro());
    
    //Rectangulo
    Rect1.modificarBase(5);
    Rect1.modificarAltura(3);
    
    System.out.println("El area del Rectangulo es: " + Rect1.calcularArea());
    System.out.println("El perimetro del Rectangulo es: " + Rect1.calcularPerimetro());
    
    //Circulo
    Circ1.modificarRadio(1.5);
    
    System.out.println("La circunferencia del circulo es:" + Circ1.calcularCircunferencia());
    System.out.println("El area del circulo es: " + Circ1.calcularArea());
    
    //Triangulo
    Tria1.modificarLado1(5);
    Tria1.modificarLado2(3);
    Tria1.modificarLado3(5);
    
    System.out.println("El perimetro del triangulo es: " + Tria1.calcularPerimetro());
    System.out.println("El tipo de traingulo que es: " + Tria1.determinarTipo());
    
    //Pruebas para determinar tipos restantes:
    Tria1.modificarLado1(5);
    Tria1.modificarLado2(4);
    Tria1.modificarLado3(1);
   
    System.out.println("El tipo de traingulo que es: " + Tria1.determinarTipo());

    Tria1.modificarLado1(5);
    Tria1.modificarLado2(5);
    Tria1.modificarLado3(5);

    System.out.println("El tipo de traingulo que es: " + Tria1.determinarTipo());

    } 
}
