
import java.io.Serializable;


/**
 *
 * @author luis
 */
public class Sala2D extends Sala implements Serializable{
    
    public Sala2D(String nombre) {

        this.setNombreSala(nombre);
        this.setPrecio(2600.0);

    }
    
}
