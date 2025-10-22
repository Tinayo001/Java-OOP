import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;


public class FileCopyDemo2 {
    public static void main(String[] args) {
        try (FileChannel sourceChannel = new FileInputStream("file2.txt").getChannel();
             FileChannel destChannel = new FileOutputStream("file3.txt").getChannel()) {

            sourceChannel.transferTo(0, sourceChannel.size(), destChannel);
            System.out.println("File copied using FileChannel!");
        }
        catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
