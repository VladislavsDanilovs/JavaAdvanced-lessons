package Lesson14_IO_and_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Example12_PathAndFiles2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Work\\Desktop\\directory\\M");
        Path anotherPath = Paths.get("C:\\Users\\Work\\Desktop\\git1");
//        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(filePath, directoryPath.resolve("text16.txt"));

//        Files.copy(anotherPath, directoryPath.resolve("B"));

//        Files.move(filePath, directoryPath.resolve("test15.txt"));

//        Files.move(Paths.get("text10.txt"), Paths.get("text11.txt"));

//        Files.delete(Paths.get("text5.txt"));
        Files.delete(directoryPath);

        System.out.println("Done!");
    }
}
