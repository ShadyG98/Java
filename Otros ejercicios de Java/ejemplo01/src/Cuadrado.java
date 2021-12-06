
/**
 * @author Brenda Giselle Escobar
 */
public class Cuadrado {
    private int lado;
    
    //SET
    public void modificarLado(int lado){
    this.lado = lado;
    }
    
    //Metodos
    public int calcularArea(){
    return lado*lado;
    }
    
    public int calcularPerimetro(){
    return lado*4;
    }
}


