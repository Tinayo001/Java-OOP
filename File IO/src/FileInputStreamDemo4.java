import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileInputStreamDemo4 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file3.txt")) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while((bytesRead = fis.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, bytesRead));
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
