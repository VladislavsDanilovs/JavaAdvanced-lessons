package Lesson14_IO_and_NIO;

import java.io.*;

public class Example4_BufferedReader_BufferedWriter {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("text2.txt"));
             BufferedWriter writer = new BufferedWriter(
                     new FileWriter("text3 .txt"))

        ) {
//            int character;
//            while ((character = reader.read()) != -1) {
//                writer.write(character);
//            }

            String line;
            while ((line= reader.readLine())!= null){
                writer.write(line);
                writer.write('\n');
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
