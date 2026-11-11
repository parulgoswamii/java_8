
import java.net.*;
import java.io.*;

public class FileDownloader {
    public static void main(String[] args) {
        try {
            URL url = URI.create(
                "https://www.example.com/sample.txt").toURL();

            URLConnection connection = url.openConnection();

            InputStream input = connection.getInputStream();

            FileOutputStream output =
                new FileOutputStream("downloaded.txt");

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }

            input.close();
            output.close();

            System.out.println("File downloaded successfully.");

        } catch (Exception e) {
            System.out.println("Download failed: " + e);
        }
    }
}
