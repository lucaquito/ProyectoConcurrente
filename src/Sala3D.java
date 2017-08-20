
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
public class Sala3D extends Sala implements Serializable{

    public Sala3D(String nombre) {

        this.setNombreSala(nombre);
        this.setPrecio(3500.0);

    }

}
