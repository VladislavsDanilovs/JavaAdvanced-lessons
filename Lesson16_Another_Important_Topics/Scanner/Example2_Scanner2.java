package Lesson16_Another_Important_Topics.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Example2_Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = null;
        Set<String> set = new TreeSet<>();

        try {
            scanner = new Scanner(new FileReader(
                    new File("C:\\Users\\Work\\Desktop\\text1.txt")));

            scanner.useDelimiter("\\W");

            while (scanner.hasNext()) {
                String word = scanner.next();
                set.add(word);
            }
            set.stream().forEach(e -> System.out.println(e));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
