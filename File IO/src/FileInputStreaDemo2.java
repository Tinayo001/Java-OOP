import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreaDemo2 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file2.txt")) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, bytesRead));
            }
        }
        catch (FileNotFoundException e) {
            System.err.print("File not found" + e.getMessage());
        }
        catch (IOException e) {
            System.err.println("I/O Error" + e.getMessage());
        }
    }
}
