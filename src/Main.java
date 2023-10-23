import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N=1;
        while (true) {
            System.out.println("Введите путь: ");
            String path=new Scanner(System.in).nextLine();
            File file= new File(path);
            boolean fileExists= file.exists();
            boolean isDirectory=file.isDirectory();
            boolean fileNotExists=Files.notExists(Path.of(path));

            if (isDirectory) {
                System.out.println("Указан путь не к файлу, а к папке");
                continue;
            }
            else if (fileNotExists)
            {System.out.println("Данного файла не существует");
                continue;}
            else if (fileExists) {
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер "+N);
                N++;

            }

        }
    }
}