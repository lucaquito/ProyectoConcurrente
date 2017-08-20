
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Tanda implements Serializable {

    private String nombre;
    private int[][] asientos;

    public Tanda() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(int[][] asientos) {
        this.asientos = asientos;
    }

    public Tanda(String nombre) {
        this.nombre = nombre;
        this.asientos = new int[15][5];
    }

}
