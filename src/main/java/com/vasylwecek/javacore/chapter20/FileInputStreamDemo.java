package chapter20;
import java.io.*;

public class FileInputStreamDemo {
    public static void main(String args[]) {
        int size;

        // For automatic closing of input stream, use try-with-resources
        try (FileInputStream f = new FileInputStream("FileInputStreamDemo.java")) {
            System.out.println("Total available bytes: " + (size = f.available()));
            int n = size / 40;
            System.out.println("First " + n + " bytes read from the file using read() method:");
            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }
            System.out.println("\nBytes still available: " + f.available());

            System.out.println("Reading next " + n + " bytes using read(byte[]) method:");
            byte[] b = new byte[n];
            if (f.read(b) != n) {
                System.err.println("Cannot read " + n + " bytes.");
            } else {
                System.out.println(new String(b, 0, n));
                System.out.println("Bytes still available: " + f.available());

                System.out.println("Skipping half of the remaining bytes using skip()");
                f.skip(size / 2);
                System.out.println("Bytes still available: " + f.available());

                int remaining = n / 2;
                System.out.println("Reading " + remaining + " bytes into the end of the array:");
                if (f.read(b, n / 2, remaining) != remaining) {
                    System.err.println("Cannot read " + remaining + " bytes.");
                } else {
                    System.out.println(new String(b, 0, b.length));
                    System.out.println("Bytes still available: " + f.available());
                }
            }
        } catch (IOException e) {
            System.out.println("IO Exception: " + e);
        }
    }
}
