import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;


public class FileInputStreamDemo1 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file2.txt")) {
            int data;

            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found" + e.getMessage());
        }
        catch (IOException e) {
            System.err.println("I/O Error " + e.getMessage());
        }
    }
}
