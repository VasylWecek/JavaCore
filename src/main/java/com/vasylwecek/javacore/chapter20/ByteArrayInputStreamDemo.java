package chapter20;
import java.io.*;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        byte b[] = tmp.getBytes();

        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 3);

        // Reading from input1
        int data;
        while ((data = input1.read()) != -1) {
            System.out.print((char) data);
        }
        System.out.println(); // New line

        // Reading from input2
        while ((data = input2.read()) != -1) {
            System.out.print((char) data);
        }

        // Close the streams
        input1.close();
        input2.close();
    }
}

