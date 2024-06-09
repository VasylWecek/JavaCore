package chapter21;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class MappedChannelWrite {
    public static void main(String[] args) {
        try (FileChannel fChan = (FileChannel)
            Files.newByteChannel(Paths.get("test.txt"),
                    StandardOpenOption.WRITE,
                    StandardOpenOption.READ,
                    StandardOpenOption.CREATE))
        {

            // затем сопоставить файл с буфером
            MappedByteBuffer mBuf =
                    fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            // записать заданное количество байтов в буфер
            for (int i = 0; i < 26; i++)
                mBuf.put((byte)('A' + i));
        } catch (InvalidPathException e){
            System.out.println("Oшибкa указания пути " + e);
        }catch (IOException e) {
            System.out.println("Oшибкa ввода-вывода: " + e);
        }
    }
}
