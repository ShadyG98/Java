
/**
 * @author Brenda Giselle Escobar
 */
public class Circulo {
    private double radio;
   
    //SET
    public double obtenerRadio() {
        return radio;
    }
    
    //GET
    public double modificarRadio(double radio) {
        return this.radio = radio;
    }
    
    //Metodos
    public double calcularCircunferencia(){
        return (2*(Math.PI)*radio);
    }

    public double calcularArea(){
        return Math.PI* (Math.pow(radio,2));
    }
}

