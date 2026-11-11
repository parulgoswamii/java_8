
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);

            System.out.println("Server waiting for client...");

            Socket socket = server.accept();

            System.out.println("Client connected");

            socket.close();
            server.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
