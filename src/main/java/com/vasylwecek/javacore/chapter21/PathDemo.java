package chapter21;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class PathDemo {
    public static void main(String[] args) {
        Path filepath = Paths.get("examples/test.txt");

        System.out.println("Имя файла: " + filepath.getFileName());
        System.out.println("Путь к файлу: " + filepath);
        System.out.println("Абсолютный путь к файлу: " + filepath.toAbsolutePath());
        System.out.println("Родительский каталог: " + filepath.getParent());

        try {
            if (Files.exists(filepath)) {
                System.out.println("Файл существует");

                if (Files.isHidden(filepath)) {
                    System.out.println("Файл скрыт");
                } else {
                    System.out.println("Файл не скрыт");
                }

                if (Files.isWritable(filepath)) {
                    System.out.println("Файл доступен для записи");
                }

                if (Files.isReadable(filepath)) {
                    System.out.println("Файл доступен для чтения");
                }

                BasicFileAttributes attribs = Files.readAttributes(filepath, BasicFileAttributes.class);

                if (attribs.isDirectory()) {
                    System.out.println("Это каталог");
                } else if (attribs.isRegularFile()) {
                    System.out.println("Это обычный файл");
                } else if (attribs.isSymbolicLink()) {
                    System.out.println("Это символическая ссылка");
                }

                System.out.println("Время последней модификации файла: " + attribs.lastModifiedTime());
                System.out.println("Размер файла: " + attribs.size() + " байтов");
            } else {
                System.out.println("Файл не существует");
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
