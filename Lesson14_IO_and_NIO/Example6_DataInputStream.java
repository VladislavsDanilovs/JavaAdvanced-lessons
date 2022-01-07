package Lesson14_IO_and_NIO;

import java.io.*;

public class Example6_DataInputStream {
    public static void main(String[] args) {
        try(DataOutputStream outputStream = new DataOutputStream(
                new FileOutputStream("my_test.bin"));
            DataInputStream inputStream = new DataInputStream(
                    new FileInputStream("my_test.bin"));

                ){
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeLong(120);
            outputStream.writeInt(500);
            outputStream.writeShort(2);
            outputStream.writeFloat(3.14F);
            outputStream.writeDouble(124.124);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
