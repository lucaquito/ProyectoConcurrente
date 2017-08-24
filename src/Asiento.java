
import javax.swing.JButton;

public class Asiento extends JButton {

    private int fila;
    private int columna;

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public Asiento(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

}
