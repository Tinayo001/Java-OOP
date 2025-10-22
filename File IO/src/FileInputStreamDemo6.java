import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileInputStreamDemo6 {
    public static void main(String[] args) throws IOException {
        String content = Files.readString(Paths.get("file3.txt"));
        System.out.println(content);
    }
}
