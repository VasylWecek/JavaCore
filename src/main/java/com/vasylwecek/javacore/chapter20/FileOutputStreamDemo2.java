package chapter20;
import java.io.*;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n" +
                "to come to the aid of their country\n" +
                "and pay their due taxes.";
        byte buf[] = source.getBytes();

        // Apply try-with-resources statement to close files
        try (FileOutputStream f0 = new FileOutputStream("file1.txt");
             FileOutputStream f1 = new FileOutputStream("file2.txt");
             FileOutputStream f2 = new FileOutputStream("file3.txt")) {

            // Write to files
            for (int i = 0; i < buf.length; i++) {
                f1.write(buf);

                f2.write(buf, buf.length - buf.length / 4, buf.length / 4);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
    }
}
