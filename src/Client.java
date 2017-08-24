
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
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

    public Admin recibirAdmin() {

        try {
            while (!isConnected) {

                socket = new Socket(nombreServidor, puerto);
                System.out.println("Conectado");
                isConnected = true;

                inputStream = new ObjectInputStream(socket.getInputStream());
                Admin admin = (Admin) inputStream.readObject();
                
                return admin;

                //outputStream = new ObjectOutputStream(socket.getOutputStream());
                //            Student student = new Student(1, "Bijoy");
                //            System.out.println("Object to be written = " + student);
                //            outputStream.writeObject(student);

            }

        } catch (ConnectException e) {
            JOptionPane.showMessageDialog(null, "Error al conectarse al servidor");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error desconocido");
        }
        
        return null;

    }
    
    public void enviarAdmin(Admin admin){
        
        try {
            serverSocket = new ServerSocket(4445);
            socket = serverSocket.accept();
            System.out.println("Conectado");

            outputStream = new ObjectOutputStream(socket.getOutputStream());
            
            System.out.println("Enviando administrador");
            outputStream.writeObject(admin);
            socket.close();
            serverSocket.close();

        } catch (SocketException se) {
            System.err.println("Error de socket");
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }

}
