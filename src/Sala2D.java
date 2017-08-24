
import java.io.Serializable;


/**
 *
 * @author luis
 */
public class Sala2D extends Sala implements Serializable{
    
    public Sala2D(String nombre) {

        this.setNombreSala(nombre);
        this.setPrecioAdulto(2600.0);
        this.setPrecioAdultoMayor(2000.0);
        this.setPrecioNino(2000.0);

    }
    
}
