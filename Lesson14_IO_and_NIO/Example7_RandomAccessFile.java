package Lesson14_IO_and_NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Example7_RandomAccessFile {
    public static void main(String[] args) {
        try (RandomAccessFile file =
                     new RandomAccessFile("text10.txt", "rw")) {

            int a = file.read();
            System.out.println((char)a);
            String s1 = file.readLine();
            System.out.println(s1);

            file.seek(101);
            String s2 = file.readLine();
            System.out.println(s2);

            long pointerPosition = file.getFilePointer();
            System.out.println(pointerPosition);

//            file.seek(0);
//            file.writeBytes("Hello");
            file.seek(file.length());
            file.writeBytes("\n\t\t\t William Butler Yeats");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
