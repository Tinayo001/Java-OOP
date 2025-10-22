import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileOutPutStreamDemo3 {
    public static void main(String[] args) {
        File file = new File("file3.txt");

        try (FileOutputStream fos = new FileOutputStream(file)) {
            String song = "Now playing Regina by Juma Jux ft Otile Brown";
            fos.write(song.getBytes());
            System.out.println("Added a new song to the playlist");
        }
        catch (FileNotFoundException e) {
            System.out.println("The file trying to open doesnt exits " + e.getMessage());
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
