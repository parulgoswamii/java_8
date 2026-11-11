
import java.net.*;
import java.io.*;

public class WebReader {
    public static void main(String[] args) {
        try {
            URL url = URI.create("https://example.com").toURL();

            BufferedReader reader = new BufferedReader(
                new InputStreamReader(url.openStream()));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
