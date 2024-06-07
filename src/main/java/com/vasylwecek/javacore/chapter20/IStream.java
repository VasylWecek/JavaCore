package chapter20;

import java.io.IOException;
import java.io.InputStream;
import java.io.*;

public class IStream {
    public static void main(String[] args) throws IOException {
        // PrintWriter, FileReader, InputStream, OutputStream, DataInputStream,
        // ObjectInputStream

        // Writer Reader
        // InputStream, OutputStream

        String path = "/Users/vasylwecek/Documents/JavaCore/src/main/java/com/vasylwecek/javacore/chapter20/IO_lesson31_Java_SE/3.txt";

        InputStream inputStream = null;
        try {inputStream = new FileInputStream(path);
            while (true){
                int iByte = inputStream.read();
                if (iByte != -1){
                    System.out.print((char)iByte);
                }else {
                    System.out.println("\n" + "END");
                    break;
                }
            }
        }catch (IOException e) {
            throw new IOException ("ERROR" + path + e);


        }finally{
            if (inputStream != null) {
                try {
                    inputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

        }


    }
}
