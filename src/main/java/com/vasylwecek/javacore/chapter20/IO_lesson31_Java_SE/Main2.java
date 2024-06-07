package chapter20.IO_lesson31_Java_SE;
import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        FileWriter fw = null;
        String str = "HOT";
        File file = new File("/Users/vasylwecek/Documents/JavaCore/src/main/java/com/vasylwecek/javacore/chapter20/IO_lesson31_Java_SE/3.txt");

        try {
            fw = new FileWriter(file, true);
            fw.write(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
