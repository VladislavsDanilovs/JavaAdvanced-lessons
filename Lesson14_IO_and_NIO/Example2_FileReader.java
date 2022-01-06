package Lesson14_IO_and_NIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example2_FileReader {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("text2.txt");
            int character;
            while ((character = reader.read()) !=-1){
                System.out.print((char)character);
            }
            System.out.println();
            System.out.println("File reading work has been done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
        }
    }
}
