import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;

public class Client {

    private Socket socket = null;
    private ObjectInputStream inputStream = null;
    private ObjectOutputStream outputStream = null;
    private boolean isConnected = false;

    public Client() {
    }

    public void communicate() {

        while (!isConnected) {
            try {
                socket = new Socket("localHost", 4445);
                System.out.println("Connected");
                isConnected = true;
                outputStream = new ObjectOutputStream(socket.getOutputStream());
  //                Student student = new Student(1, "Bijoy");
  //              System.out.println("Object to be written = " + student);
  //            outputStream.writeObject(student);

            } catch (SocketException se) {
                se.printStackTrace();
// System.exit(0);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
