
/**
 * @author Brenda Giselle Escobar
 */
public class Rectangulo {

    private int base;
    private int altura;

    //SET
    public void modificarBase(int base) {
        this.base = base;
    }

    public void modificarAltura(int altura) {
        this.altura = altura;
    }

    //GET
    public int obtenerBase() {
        return base;
    }

    public int obtenerAltura() {
        return altura;
    }

    //Metodos
    public int calcularArea() {
        return obtenerBase() * obtenerAltura();
    }

    public int calcularPerimetro() {
        return (obtenerBase()*2) + (obtenerAltura()*2);
    }
}
