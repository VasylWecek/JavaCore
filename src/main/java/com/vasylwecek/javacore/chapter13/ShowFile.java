package chapter13;


import java.io.*;

class ShowFile {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0])){
            int i;
            do {
                i = fin.read();
                if(i != -1) System.out.println((char) i);
            } while (i != -1);
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден.");
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}