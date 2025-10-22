import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileOutPutStreamDemo8 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("file3.txt");
        String content = "Play Stronger - Kanye\n";

        Files.writeString(path, content);
        System.out.println("✅ Wrote text to file3.txt successfully!");
    }
}
