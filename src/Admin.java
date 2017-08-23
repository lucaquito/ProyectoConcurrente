
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author luis
 */
public class Admin implements Serializable{

    private List<Pelicula> peliculas;
    private int cantAdultos = 0;
    private int cantNinos = 0;
    private int cantAdultoMayor = 0;

    public int getCantAdultos() {
        return cantAdultos;
    }

    public void setCantAdultos(int cantAdultos) {
        this.cantAdultos = cantAdultos;
    }

    public int getCantNinos() {
        return cantNinos;
    }

    public void setCantNinos(int cantNinos) {
        this.cantNinos = cantNinos;
    }

    public int getCantAdultoMayor() {
        return cantAdultoMayor;
    }

    public void setCantAdultoMayor(int cantAdultoMayor) {
        this.cantAdultoMayor = cantAdultoMayor;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public Admin() {

        this.peliculas = new LinkedList();

    }

    public void agregarPelicula(String nombre, String sinopsis, String duracion, int censura, String photo) {
        Pelicula pelicula;
        String censura2 = "";
        switch (censura) {
            case 1:
                censura2 = Censura.Mayores12.getCensura();
                break;
            case 2:
                censura2 = Censura.Mayores15.getCensura();
                break;
            case 3:
                censura2 = Censura.Mayores18.getCensura();
                break;
            case 4:
                censura2 = Censura.TodoPublico.getCensura();
                break;
        }
        pelicula = new Pelicula(nombre, sinopsis, duracion, censura2);
        pelicula.setPhoto(new ImageIcon(getClass().getResource(photo)));
        peliculas.add(pelicula);

    }

    public boolean agregarSalaPelicula(Sala sala, String nombrePeli) {

        int tamano = peliculas.size();

        for (int i = 0; i < tamano; i++) {

            Pelicula peli = peliculas.get(i);

            if (peli.getNombre().equals(nombrePeli)) {
                peliculas.get(i).getSalas().add(sala);
                return true;
            }

        }

        return false;

    }
    
    public String imprimirPeliculas(){
    
        int tamano = peliculas.size();
        String salida = "";
        
        for (int i = 0; i < tamano; i++) {
            
            Pelicula peli = peliculas.get(i);
            salida += peli.getNombre() + "\n";
         
        }
    
        return salida;
    
    }
    
    public int obtenerEntradasTotales(){
        return cantAdultoMayor+cantAdultos+cantNinos;
    }
}
