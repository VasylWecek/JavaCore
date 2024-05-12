package chapter13;
import java.io.*;

public class ShowFile3 {
    public static void main(String[] args) throws IOException {
        int i;

        // сначала убедиться, что имя файла указано
        if (args.length != 1){
            System.out.println("Иcпoльзoвaниe : CopyFile ...");
            return;
        }

        /*
        Ниже оператор try с ресурсами применяется
        сначала для открытия, а затем для автоматического
        закрытия файла по завершении блока этого оператора
         */
        try (FileInputStream fin = new FileInputStream(args[0])){
                do {
                    i = fin.read();
                    if (i != -1) System.out.print((char) i);
                }while (i != -1);
            }catch (FileNotFoundException e){
                System.out.println("Фaйл не найден . ");
            }catch (IOException e){
                System.out.println("Пpoизoшлa ошибка ввода-вывода");
            }
        }
    }

