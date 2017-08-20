
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
public class SalaVIP extends Sala implements Serializable{

    private String beneficios;
    
    public String getBeneficios() {
        return beneficios;
    }
    
    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }
    
    public SalaVIP(String nombre) {
        this.setNombreSala(nombre);
        this.setPrecio(4600.0);
        
    }
    
}
