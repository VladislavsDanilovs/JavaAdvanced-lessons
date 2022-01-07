package Lesson14_IO_and_NIO.Serialization.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization2 {
    public static void main(String[] args) {
        Car car = new Car("BMW M5 E60", "Yellow");
        Employee employee = new Employee("Mark", "Davidson", "IT", 800, car);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("bestEmployee.bin")
        )) {
            outputStream.writeObject(employee);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
