
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author luis
 */
public class Sala3D extends Sala implements Serializable {

    public Sala3D(String nombre) {

        this.setNombreSala(nombre);
        this.setPrecioAdulto(3500.0);
        this.setPrecioAdultoMayor(3200.0);
        this.setPrecioNino(3000.0);

    }

}
