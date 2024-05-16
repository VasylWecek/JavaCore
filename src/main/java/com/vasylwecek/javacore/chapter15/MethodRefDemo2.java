package chapter15;

public class MethodRefDemo2 {
    // Функциональный интерфейс для обработки строк
    interface StringFunc {
        String func(String n);
    }

    // Класс с методом для реверса строки
    static class MyStringOps {
        // Метод экземпляра для реверса строки
        String strReverse(String str) {
            String result = "";
            int i;

            // Реверсирование строки
            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        }
    }

    // Метод, принимающий функциональный интерфейс и строку
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        // Создание экземпляра MyStringOps
        MyStringOps strOps = new MyStringOps();

        // Использование ссылки на метод экземпляра
        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}
