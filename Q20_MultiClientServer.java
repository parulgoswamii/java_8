
import java.net.*;
import java.io.*;

public class Q20_MultiClientServer {

    public static void main(String[] args) {

        try (ServerSocket server = new ServerSocket(5000)) {

            System.out.println("Server Started...");

            while (true) {

                Socket socket = server.accept();

                Thread t = new Thread(() -> {

                    try {
                        BufferedReader in =
                                new BufferedReader(
                                    new InputStreamReader(
                                        socket.getInputStream()
                                    )
                                );

                        String message = in.readLine();

                        System.out.println(
                            Thread.currentThread().getName()
                            + " received: " + message
                        );

                        socket.close();

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                });

                t.start();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
