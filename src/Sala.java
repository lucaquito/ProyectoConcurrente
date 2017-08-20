
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Sala implements Serializable{

    private String nombreSala;
    private List<Tanda> listaHorarios;

    public List<Tanda> getListaHorarios() {
        return listaHorarios;
    }

    public void setListaHorarios(List<Tanda> listaHorarios) {
        this.listaHorarios = listaHorarios;
    }

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

    public Sala(String nombreSala, Double precio) {
        this.nombreSala = nombreSala;
        this.precio = precio;
    }

    public Sala() {
        this.listaHorarios = new LinkedList();
        
        listaHorarios.add(new Tanda("1:30pm"));
        listaHorarios.add(new Tanda("3:30pm"));
        listaHorarios.add(new Tanda("7:00pm"));

    }

}
