package chapter20;

import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        String path = "/Users/vasylwecek/Documents/JavaCore/src/main/java/com/vasylwecek/javacore/chapter20/IO_lesson31_Java_SE/1.txt";
        File file = new File(path);

        System.out.println("File name: " + file.getName() + "\n");

        System.out.println("Path: " + file.getPath());
        System.out.println("Absolute path: " + file.getAbsolutePath() + "\n");

        System.out.println("Parent directory: " + file.getParent() + "\n"); // имя родительского каталога
        System.out.println("File length: " + file.length() + "\n");

        System.out.println("File " + (file.exists() ? "exists" : "does not exist") + "\n"); // логическое значение true, если файл существует
        System.out.println("File " + (file.canWrite() ? "writable" : "non-writable") + "\n");
        System.out.println("File " + (file.canRead() ? "readable" : "non-readable") + "\n");
        System.out.println(("File " + (file.isDirectory() ? "is directory" : "is a directory") + "\n"));
        System.out.println("File " + (file.isFile() ? "exists" : "does not exist") + "\n");
        System.out.println("File " + (file.isHidden() ? "hidden" : "is hidden") + "\n");


        System.out.println("Total space " + CapacityFormatter.toGigabytes(Long.parseLong(file.getTotalSpace() + "Gb")));
        System.out.println("Free space " + CapacityFormatter.toGigabytes(Long.parseLong(file.getFreeSpace() + "Gb")));

    }

    private static class CapacityFormatter{
        private static long toGigabytes(long capacity){
            return capacity / (long) Math.pow(1024, 2);
        }
    }
}
