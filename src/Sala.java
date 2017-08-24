
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Sala implements Serializable{

    private String nombreSala;
    private List<Tanda> listaHorarios;
    private Double precioAdulto;
    private Double precioNino;
    private Double precioAdultoMayor;

    public List<Tanda> getListaHorarios() {
        return listaHorarios;
    }

    public void setListaHorarios(List<Tanda> listaHorarios) {
        this.listaHorarios = listaHorarios;
    }

    public Double getPrecioAdulto() {
        return precioAdulto;
    }

    public void setPrecioAdulto(Double precioAdulto) {
        this.precioAdulto = precioAdulto;
    }

    public Double getPrecioNino() {
        return precioNino;
    }

    public void setPrecioNino(Double precioNino) {
        this.precioNino = precioNino;
    }

    public Double getPrecioAdultoMayor() {
        return precioAdultoMayor;
    }

    public void setPrecioAdultoMayor(Double precioAdultoMayor) {
        this.precioAdultoMayor = precioAdultoMayor;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public Sala() {
        this.listaHorarios = new LinkedList();
        
        listaHorarios.add(new Tanda("1:30pm"));
        listaHorarios.add(new Tanda("3:30pm"));
        listaHorarios.add(new Tanda("7:00pm"));

    }

}
