package Lesson14_IO_and_NIO.Serialization.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serialization1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Viktor");
        employees.add("Vladimir");
        employees.add("Vladislav");
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees1.bin"))

                ){
            outputStream.writeObject(employees);
            System.out.println("Serialization has been successfully done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
