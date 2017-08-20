
import java.util.LinkedList;
import java.util.List;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author luis
 */
public class Admin {

    private List<Pelicula> peliculas;

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public Admin() {

        this.peliculas = new LinkedList();

    }

//      private String nombre;
//    private String sinopsis;
//    private String duracion;
//    private String censura;
//    private List<Sala> salas;
//    private ImageIcon photo;
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

}
