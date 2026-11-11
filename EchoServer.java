
import java.net.*;
import java.io.*;

public class EchoServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);

            System.out.println("Echo Server Started...");

            Socket socket = server.accept();

            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

            PrintWriter out = new PrintWriter(
                socket.getOutputStream(), true);

            String message = in.readLine();

            System.out.println("Received: " + message);

            out.println(message);

            System.out.println("Message echoed to client.");

            socket.close();
            server.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
