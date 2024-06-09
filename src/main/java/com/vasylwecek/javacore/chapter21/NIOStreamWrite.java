package chapter21;
import java.io.*;
import java.nio.file.*;

public class NIOStreamWrite {
    public static void main(String[] args) {
        // Открыть файл и получить связанный с ним поток вывода
        try (OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Paths.get("test.txt")))) {
            // Вывести в поток заданное количество байтов (алфавит)
            for (int i = 0; i < 26; i++) {
                fout.write((byte)('A' + i));
            }
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
