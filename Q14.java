
import java.net.*;
import java.io.*;

public class Q14 {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);

            System.out.println("Server waiting...");

            Socket socket = server.accept();

            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

            String message = in.readLine();

            System.out.println("Received from client: " + message);

            socket.close();
            server.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
