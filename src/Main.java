import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Path path = Paths.get("report.txt");
        List<String> list = Arrays.asList("Строка 1 записана в файл.");
        try {
            Files.write(path, list,  StandardOpenOption.CREATE_NEW);
        } catch (IOException e) {
            System.out.println("report.txt уже существует");
        }
    }
}
