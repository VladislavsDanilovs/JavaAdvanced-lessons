package Lesson14_IO_and_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Example13_PathAndFiles3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("text10.txt");
//        Files.createFile(filePath);
//        String dialog = "Hello\n Hello\n How are you? \n Good,thank you. And you? \n I'm good, thanks.";
//        Files.write(filePath, dialog.getBytes());
        List<String> list = Files.readAllLines(filePath);
        for (String s : list) {
            System.out.println(s);
        }

    }
}
