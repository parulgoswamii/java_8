
import java.net.*;

public class MessageSender {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();

            String message = "Ping";

            byte[] data = message.getBytes();

            InetAddress address =
                InetAddress.getByName("localhost");

            DatagramPacket packet = new DatagramPacket(
                data, data.length, address, 6000);

            socket.send(packet);

            System.out.println("Message sent: " + message);

            socket.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
