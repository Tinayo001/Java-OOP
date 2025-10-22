import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;

public class FileOutputDemo1 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        try (FileOutputStream fos = new FileOutputStream("file2.txt")) {
            fos.write("Listening to Sisiskii by juma jux".getBytes());
            System.out.println("Added to play list juma jux");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
