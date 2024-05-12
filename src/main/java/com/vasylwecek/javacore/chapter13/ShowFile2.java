package chapter13;
import java.io.*;

public class ShowFile2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        // сначала убедиться, что имя файла указано
        if (args.length != 1){
            System.out.println("Иcпoльзoвaниe : ShowFile Ввод-вывод_аплеты.txt");
            return;
        }

        /*
        В следующем коде сначала открывается файл, а затем
        из него читаются символы до тех пор, пока не встретится
        признак конца файла
         */

        try {
            fin = new FileInputStream (args[0]);
            do {
                i = fin.read();
                if (i != -1) System.out.println((char)i);
            }while (i != -1);

        } catch (FileNotFoundException e){
            System.out.println("Фaйл не найден.");
        }catch (IOException e){
            System.out.println("Пpoизoшлa ошибка ввода-вывода");

        }finally {
            // закрыть файл в люОом случае
            try {
                if (fin != null) fin.close();
            }catch (IOException e ){
                System.out.println("Oшибкa закрытия файла");
            }
        }
    }
}
