import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyDemo1 {
    public static void main(String[] args) {
        Path source = Path.of("file2.txt");
        Path destination = Path.of("file3.txt");

        try {
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully!");
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
