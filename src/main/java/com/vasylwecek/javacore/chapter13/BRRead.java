package chapter13;
import java.io.*;
// Использовать класс BufferedReader для чтения символов с консоли

public class BRRead {
    public static void main (String args[]) throws IOException{

        char c;

        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        //InputStreamReader — это мост между потоками байтов (InputStream)
        // и потоками символов (Reader), он читает байты и декодирует их в
        // символы с использованием указанной кодировки (по умолчанию
        // используется кодировка платформы).

        System.out.println("Bвeдитe символы, 'q' - для выхода.");
        // читать символы
        do {
            c = (char) br.read();
            System.out.println(c);
        }while (c != 'q');

    }
}
