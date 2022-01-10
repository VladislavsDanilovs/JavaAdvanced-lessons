package Lesson14_IO_and_NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Example9_ChannelBuffer {
    public static void main(String[] args) {
        try(RandomAccessFile file =
                    new RandomAccessFile("text10.txt", "rw");
            FileChannel channel = file.getChannel();){

            ByteBuffer buffer = ByteBuffer.allocate(25); //capacity is 25
            StringBuilder poem = new StringBuilder();

            int byteRead = channel.read(buffer); //reading information from file "text10.txt", and writing it in buffer
            while(byteRead>0){
                //checking if the information was captured in buffer, if yes, doing the same process again
                System.out.println("Read "+ byteRead);
                //ByteRead>0 means that there are some symbols that can be readed

                buffer.flip(); //changing Buffer mode from WRITE to READ, to read information and send it to our StringBuilder poem.
                while (buffer.hasRemaining()){
                   poem.append((char)buffer.get()); //reading info from buffer and appending it to StringBuilder byte by byte, till we get 25bytes
                }
                buffer.clear(); //moving buffer position to index 0, to rewrite existing info, and continue writing next info from file
                byteRead = channel.read(buffer); //reading information from file "text10.txt", and writing next 25bytes in buffer

            }
            System.out.println(poem);

            String text = "\nThere are only two ways to live your life. One is as though nothing is a miracle. The other is as though everything is a miracle. - Albert Einstein";
//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//            buffer2.put(text.getBytes());
//            buffer2.flip();
//            channel.write(buffer2);

            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes()); //method wrap does everything that is commented above
            channel.write(buffer2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
