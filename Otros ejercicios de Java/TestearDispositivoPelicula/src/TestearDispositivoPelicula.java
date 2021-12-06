
public class TestearDispositivoPelicula {

   public static void main(String[] args) {

    Pelicula uno = new Pelicula();
    uno.Titulo = "Pokémon: Lucario y el misterio de Mew";    
    uno.Genero = "Fantasia";
    uno.Calificacion = 80;

    Pelicula dos = new Pelicula();
    dos.Titulo = "El castillo ambulante";
    dos.Genero = "Fantasia";
    dos.Calificacion = 100;
    dos.Reproducir();

    Pelicula tres = new Pelicula();
    tres.Titulo = "Shrek";
    tres.Genero = "Comedia y Fantasia";
    tres.Calificacion = 100;
    }  
}
