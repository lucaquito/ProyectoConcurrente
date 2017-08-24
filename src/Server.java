
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import javax.swing.JOptionPane;

public class Server {

    private ServerSocket serverSocket = null;
    private Socket socket = null;
    private ObjectInputStream inStream = null;
    private ObjectOutputStream outputStream = null;
    private Admin admin;
    private boolean isConnected = false;
    private final String nombreServidor;
    private final int puerto;

    public Server(Admin admin) {
        this.admin = admin;
        this.puerto = 223;
        this.nombreServidor="";
    }

    public void communicate() throws ClassNotFoundException {
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
    
//    public Admin recibirAdmin() {
////
////        try {
////            while (!isConnected) {
////
////                socket = new Socket(nombreServidor, puerto);
////                System.out.println("Conectado");
////                isConnected = true;
////
////                inputStream = new ObjectInputStream(socket.getInputStream());
////                Admin admin = (Admin) inputStream.readObject();
////                
////                return admin;
////
////                //outputStream = new ObjectOutputStream(socket.getOutputStream());
////                //            Student student = new Student(1, "Bijoy");
////                //            System.out.println("Object to be written = " + student);
////                //            outputStream.writeObject(student);
////
////            }
////
////        } catch (ConnectException e) {
////            JOptionPane.showMessageDialog(null, "Error al conectarse al servidor");
////        } catch (Exception e) {
////            JOptionPane.showMessageDialog(null, "Error desconocido");
////        }
////        
////        return null;
//
//    }

}
