package Lesson14_IO_and_NIO;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Example8_File {
    public static void main(String[] args) throws IOException {
        File file = new File("text2.txt"); //relative path
        File folder = new File("C:\\Users\\Work\\Desktop\\directory"); //absolute path

        System.out.println("file.getAbsoluteFile() "+file.getAbsoluteFile());
        System.out.println("folder.getAbsoluteFile() "+folder.getAbsoluteFile());
        System.out.println("----------------------------------------------");

        System.out.println("file.isAbsolute() "+file.isAbsolute());
        System.out.println("folder.getAbsoluteFile() "+folder.isAbsolute());
        System.out.println("----------------------------------------------");

        System.out.println("file.isDirectory() "+file.isDirectory());
        System.out.println("folder.isDirectory() "+folder.isDirectory());
        System.out.println("----------------------------------------------");

        System.out.println("file.exists() "+file.exists());
        System.out.println("folder.exists() "+folder.exists());
        System.out.println("----------------------------------------------");

        System.out.println("file.createNewFile() "+file.createNewFile());
        System.out.println("folder.mkdir() "+folder.mkdir()); //make directory
        System.out.println("----------------------------------------------");

        System.out.println("file.length() "+file.length());
        System.out.println("folder.length() "+folder.length());
        System.out.println("----------------------------------------------");

//        System.out.println("file.delete() "+file.delete());
//        System.out.println("folder.delete() "+folder.delete());
//        System.out.println("----------------------------------------------");

        File[] file2 = folder.listFiles();
        System.out.println(Arrays.toString(file2));
        System.out.println("folder.listFiles() "+folder.listFiles());
        System.out.println("----------------------------------------------");

        System.out.println("folder.isHidden() "+folder.isHidden());
        System.out.println("----------------------------------------------");

        System.out.println("file.canRead() "+file.canRead());
        System.out.println("folder.canWrite() "+folder.canWrite());
        System.out.println("folder.canExecute() "+folder.canExecute());
        System.out.println("----------------------------------------------");

    }
}
