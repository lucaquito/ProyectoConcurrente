
import java.util.LinkedList;
import java.util.List;

public class Sala {

    private String nombreSala;
    private List<String> listaHorarios;
    private int[][] asientos;

    public List<String> getListaHorarios() {
        return listaHorarios;
    }

    public void setListaHorarios(List<String> listaHorarios) {
        this.listaHorarios = listaHorarios;
    }

    public int[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(int[][] asientos) {
        this.asientos = asientos;
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
        listaHorarios.add("1:30pm");
        listaHorarios.add("3:30pm");
        listaHorarios.add("7:00pm");
    }

}
