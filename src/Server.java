
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server {

    private ServerSocket serverSocket = null;
    private Socket socket = null;
    private ObjectInputStream inStream = null;
    private ObjectOutputStream outputStream = null;
    private Admin admin;

    public Server(Admin admin) {
        this.admin = admin;
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

        } catch (SocketException se) {
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
