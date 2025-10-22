import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileOutputstreamDemo2 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File file = new File("file2.txt");

        try (FileOutputStream fos = new FileOutputStream(file)) {
            String song = "Playing miondoko by Zero Sufuri";
            fos.write(song.getBytes());
            System.out.println("Added a new song to the playlist 🎵");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

