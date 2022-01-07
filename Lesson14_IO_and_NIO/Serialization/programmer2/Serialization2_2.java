package Lesson14_IO_and_NIO.Serialization.programmer2;

import Lesson14_IO_and_NIO.Serialization.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serialization2_2 {
    public static void main(String[] args) {
        Employee bestEmployee;

        try(ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("bestEmployee.bin")
        )){
            bestEmployee = (Employee)inputStream.readObject();
            System.out.println(bestEmployee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
