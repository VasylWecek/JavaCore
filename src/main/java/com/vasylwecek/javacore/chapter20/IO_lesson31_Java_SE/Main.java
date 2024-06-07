package chapter20.IO_lesson31_Java_SE;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;
        InputStreamReader isr = null;
        int b=0;
        try {

            fis = new FileInputStream("/Users/vasylwecek/Documents/JavaCore/src/main/java/com/vasylwecek/javacore/chapter20/IO_lesson31_Java_SE/1.txt");
            isr = new InputStreamReader(fis, "UTF-8");
            while ((b=isr.read())!= -1){
                    System.out.print((char)b);
                }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            } try {
                isr.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
