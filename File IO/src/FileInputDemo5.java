import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileInputDemo5 {
    public static void main(String[] args) throws IOException {
        String content = Files.readString(Paths.get("file2.txt"));
        System.out.println(content);
    }
}
