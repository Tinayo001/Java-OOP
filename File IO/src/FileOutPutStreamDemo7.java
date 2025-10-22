import java.io.IOException;
import java.net.URI;
import java.nio.file.*;

public class FileOutPutStreamDemo7 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("file3.txt");
        String content = "Play Diamond Platnumz – Waache Waoane ft Chege\\n";

        Files.writeString(path, content);
        System.out.println("✅ Wrote text to file.txt successfully!");
    }
}
