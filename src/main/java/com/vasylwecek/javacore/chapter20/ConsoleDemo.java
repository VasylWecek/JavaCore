package chapter20;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;

        con = System.console();

        // Проверка на наличие консоли
        if (con == null) {
            return;
        }

        // Чтение строки с консоли
        str = con.readLine("Enter a string: ");
        // Вывод строки на консоль
        con.printf("%s\n", str);
    }
}
