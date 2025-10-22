import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;


public class FileOutPutDemo {
    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("file.txt")){
            fos.write("Hello Tinayo!".getBytes());
            System.out.println("Wrote to file.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
