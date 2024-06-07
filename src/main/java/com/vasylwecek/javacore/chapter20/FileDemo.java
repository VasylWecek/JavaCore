package chapter20;
import java.io.File;

public class FileDemo {
    static void p(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File ("/Users/vasylwecek/Documents/JavaCore/src/main/java/com/vasylwecek/javacore/chapter20/IO_lesson31_Java_SE/3.txt");

        p("Name of file: " + f1.getName());
        p("Reference to file: " + f1.getAbsolutePath());
        p("Absolute path: " + f1.getAbsolutePath());
        p("Parent: " + f1.getParent());
        p(f1.exists() ? "exists: " + f1.exists() : "does not exist: " + f1.exists());
        p(f1.canWrite() ? "can write: " + f1.canWrite() : "can not write: " + f1.canWrite());
        p(f1.canRead() ? "can read: " + f1.canRead() : "can not read: " + f1.exists());
        p(f1.isDirectory() ? "is directory: " + f1.isDirectory() : "is not a directory: " + f1.isDirectory());
        p(f1.isFile() ? "is: " + f1.isFile() : "is not a file: " + f1.isFile());
        p(f1.isAbsolute() ? "is: " + f1.isAbsolute() : "is not absolute:" + f1.isAbsolute());

        p("Last modified: " + f1.lastModified());
        p("Length: " + f1.length() + "bytes");
    }
}
