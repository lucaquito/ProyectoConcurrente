
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Client {

    private Socket socket = null;
    private ObjectInputStream inputStream = null;
    private ObjectOutputStream outputStream = null;
    private boolean isConnected = false;
    private final String nombreServidor;
    private final int puerto;
    private ServerSocket serverSocket = null;

    public Client(String nombreServidor, int puerto) {
        this.nombreServidor = nombreServidor;
        this.puerto = puerto;

    }

    public Admin recibirAdmin() throws IOException {

        try {
            while (!isConnected) {

                socket = new Socket(nombreServidor, puerto);
                System.out.println("Conectado");
                isConnected = true;

                inputStream = new ObjectInputStream(socket.getInputStream());
                Admin admin = (Admin) inputStream.readObject();

                socket.close();
                inputStream.close();

                return admin;

                //outputStream = new ObjectOutputStream(socket.getOutputStream());
                //            Student student = new Student(1, "Bijoy");
                //            System.out.println("Object to be written = " + student);
                //            outputStream.writeObject(student);
            }

        } catch (ConnectException e) {
            JOptionPane.showMessageDialog(null, "Error al conectarse al servidor");
            socket.close();
            inputStream.close();
        } catch (Exception e) {
            socket.close();
            inputStream.close();
            JOptionPane.showMessageDialog(null, "Error desconocido");
        }

        return null;

    }

    public void enviarAdmin(Admin admin) {

        try {
            socket = new Socket(nombreServidor, puerto);
            System.out.println("Se conectó al servidor");

            outputStream = new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeObject(admin);

            outputStream.close();
            socket.close();

        } catch (Exception e) {
            System.out.println("Ocurrio un problema");
        }

    }

}
