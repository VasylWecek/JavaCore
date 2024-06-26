package chapter21;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class ExplicitChannelWrite {
    public static void main(String[] args) {

        // получить канал к файлу в блоке оператора try с ресурсами
        try ( FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test.txt"),
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE)){


            // буфер
            ByteBuffer mBuf = ByteBuffer.allocate(26);

            // записать некоторое количество байтов в буфер
            for (int i = 0; i < 26; i++)
                mBuf.put((byte) ('A' + i));

                // подготовить буфер к записи данных
                mBuf.rewind();

                // записать данные из буфера в выходной файл
                fChan.write(mBuf);
            }catch (InvalidPathException e){
                System.out.println("Omибкa указания пути: " + e);
            }catch (IOException e){
                System.out.println("Omибкa ввода-вывода: " + e);
                System.exit(1);
            }
        }
}
