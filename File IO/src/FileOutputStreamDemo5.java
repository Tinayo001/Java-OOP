import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileOutputStreamDemo5 {
    public static void main(String[] args) {
        File file = new File("file2.txt");
        String song = "Play new song The Weekend Save your tears\n";

        try (FileOutputStream fos = new FileOutputStream(file, true)) {
            fos.write(song.getBytes());
            System.out.println("Added a new song to the playlist");
        } catch (FileNotFoundException e) {
            System.err.println("File not found" + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException" + e.getMessage());
        }
    }
}
