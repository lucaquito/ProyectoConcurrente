
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis
 */
public class Sala {
    private String nombreSala;
    private List<Tanda> tandas;
    private Double precio;

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

  
    

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public List<Tanda> getTandas() {
        return tandas;
    }

    public void setTandas(List<Tanda> tandas) {
        this.tandas = tandas;
    }

    public Sala(String nombreSala, List<Tanda> tandas, Double precio) {
        this.nombreSala = nombreSala;
        this.tandas = tandas;
        this.precio = precio;
    }

   

    public Sala() {
    }
    
  
}
