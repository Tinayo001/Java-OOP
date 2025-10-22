import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileOutPutStreamDemo4 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("file4.txt", true)) {
            String song = "Play Diamond Platnumz Waache waoane ft Chege\n";
            fos.write(song.getBytes());
            System.out.println("Added a new song to the playlist");
        }
        catch (FileNotFoundException e) {
            System.out.println("The file was not found " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("Error writing to file:" + e.getMessage());
        }
    }
}
