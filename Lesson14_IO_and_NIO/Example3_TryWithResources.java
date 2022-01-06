package Lesson14_IO_and_NIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example3_TryWithResources {
    public static void main(String[] args) throws IOException {
        String rubai = "Ray of light, \n" +
                "or starless night. \n" +
                "Every poem, \n" +
                "wings of flight. \n";
        String hello = "Hello";

        try(FileWriter writer = new FileWriter("text2.txt", true);
            FileReader reader = new FileReader("text2.txt")) {
//            for (int i = 0; i < rubai.length(); i++) {
//                writer.write(rubai.charAt(i));
//            }
//            writer.write(rubai);
            writer.write(hello);
            System.out.println("File writing work has been done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
