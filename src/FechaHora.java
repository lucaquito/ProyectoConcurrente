import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class FechaHora extends Thread {
    
    private final JLabel Hora;
    private final JLabel Fecha;
    
    public FechaHora(JLabel Hora, JLabel Fecha) {
        this.Hora = Hora;
        this.Fecha = Fecha;
        // Constructor que nos permite obtener el nombre de las etiquetas donde 
        // van a ser impresos los datos.
    }
    
    @Override
    public void run() {
        // Permite crear un “hilo” el cual se actualiza cada segundo para obtener 
        // la fecha y hora del sistema.
        while (true) {
            Date Actual = new Date();
            SimpleDateFormat Hor = new SimpleDateFormat("HH:mm.ss");
            SimpleDateFormat Fech = new SimpleDateFormat("yyyy/MM/dd");
            Hora.setText(Hor.format(Actual));
            Fecha.setText(Fech.format(Actual));
            try {
                sleep(1000);
            } catch (Exception e) {
                
            }
        }
    }
}
