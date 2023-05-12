import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        File file1 = new File("file.txt");
        File file2 = new File("filecopy.txt");
        Files.copy(file1.toPath(),file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
} 