package chapter10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundEXceptionDemo {
    public static void main(String[] args) throws java.lang.Exception {
        File file = new File("nullFile.txt");
        FileReader fileReader = new FileReader(file);


        // Чтение данных из файла в массив символов charArray.
        char[] charArray = new char[100];
        fileReader.read(charArray);

        // Печать содержимого массива
        for (char character : charArray) {
            System.out.println(character);
        }
        fileReader.close();

    }
}
