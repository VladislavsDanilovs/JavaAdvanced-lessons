package Lesson14_IO_and_NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Example10_ChannelBuffer2 {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("text5.txt", "rw");) {
            FileChannel channel = file.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            buffer.rewind();
            System.out.println((char)buffer.get()); //a

            System.out.println("-----------------------");
            buffer.compact();
            channel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()){
                System.out.println((char)buffer.get());
            }
            System.out.println("-----------------------");
            buffer.clear();
            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get());
            buffer.mark();
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
