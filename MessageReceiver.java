
import java.net.*;

public class MessageReceiver {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(6000);

            byte[] data = new byte[1024];

            DatagramPacket packet =
                new DatagramPacket(data, data.length);

            System.out.println("Waiting for message...");

            socket.receive(packet);

            String message = new String(
                packet.getData(), 0, packet.getLength());

            System.out.println("Received Message: " + message);

            socket.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
