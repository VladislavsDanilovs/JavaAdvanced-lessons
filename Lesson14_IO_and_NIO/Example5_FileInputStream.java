package Lesson14_IO_and_NIO;

import java.io.*;

public class Example5_FileInputStream {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:\\" +
                "Users\\Work\\Desktop\\java.jpg");
             FileOutputStream outputStream = new FileOutputStream("java.jpg");
        ) {
            int i;
            while ((i=inputStream.read()) !=-1){
                outputStream.write(i);
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
