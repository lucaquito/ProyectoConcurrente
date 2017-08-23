
public class Servidor {

    public static Admin admin = new Admin();

    public static void main(String[] args) throws ClassNotFoundException {

        crearServer();
        Server servidor = new Server(admin);

        while (true) {
            servidor.communicate();
        }

    }

    public static void crearServer() {

        admin.agregarPelicula("Spider-Man", "", "156 Min", 2, "Peliculas/spider-man.png");
        admin.agregarPelicula("Planeta de los Simios", "", "166 Min", 2, "Peliculas/Dawn-Planet-of-the-Apes-Poster-Large-128x128.jpg");
        admin.agregarPelicula("Anabelle 2", "", "146 Min", 3, "Peliculas/ana.jpg");
        admin.agregarPelicula("Cars 3", "", "176 Min", 1, "Peliculas/cars-3.jpg");
        admin.agregarPelicula("Emoji", "", "136 Min", 1, "Peliculas/emoji.jpeg");
        admin.agregarPelicula("Mi vilano Favorito 3", "", "126 Min", 1, "Peliculas/mi.jpg");

        Sala2D sala2D = new Sala2D("Sala 2D");
        Sala3D sala3D = new Sala3D("Sala 3D");
        SalaVIP salavip = new SalaVIP("Sala VIP");

        admin.agregarSalaPelicula(sala2D, "Spider-Man");
        admin.agregarSalaPelicula(sala3D, "Spider-Man");
        admin.agregarSalaPelicula(salavip, "Spider-Man");

        admin.agregarSalaPelicula(sala2D, "Planeta de los Simios");
        admin.agregarSalaPelicula(sala3D, "Planeta de los Simios");
        admin.agregarSalaPelicula(salavip, "Planeta de los Simios");

        admin.agregarSalaPelicula(sala2D, "Anabelle 2");
        admin.agregarSalaPelicula(sala3D, "Anabelle 2");
        admin.agregarSalaPelicula(salavip, "Anabelle 2");

        admin.agregarSalaPelicula(sala2D, "Cars 3");
        admin.agregarSalaPelicula(sala3D, "Cars 3");

        admin.agregarSalaPelicula(sala2D, "Emoji");

        admin.agregarSalaPelicula(sala2D, "Mi vilano Favorito 3");
        admin.agregarSalaPelicula(sala3D, "Mi vilano Favorito 3");

    }

}
