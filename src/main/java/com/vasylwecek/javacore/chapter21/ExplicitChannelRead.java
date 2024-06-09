package chapter21;
import java.nio.*;
import java.io.*;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.*;
public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filepath = null;

        // путь к файлу
        try {
            filepath = Paths.get("/Users/vasylwecek/Documents/JavaCore/src/main/java/com/vasylwecek/javacore/chapter21/NIO.txt");
        }catch (InvalidPathException e){
            System.out.println("Path Error: " + e);
            return;
        }

        // канал к файлу
        // в блоке try

        try (SeekableByteChannel fChan = Files.newByteChannel (filepath)){
            ByteBuffer mBuf = ByteBuffer.allocate(128);

            do {
                count = fChan.read(mBuf);

                if (count != -1){
                    mBuf.rewind();

                    for (int i =0; i<count; i++)
                        System.out.print((char)mBuf.get());

                }
            } while(count != -1);
            System.out.println();
            } catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
