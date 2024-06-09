package chapter21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirTreeList {
    public static void main(String[] args) {
        String dirname = "";
        System.out.println("Дерево каталогов, начиная с каталога " + dirname + ":\n");

        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
