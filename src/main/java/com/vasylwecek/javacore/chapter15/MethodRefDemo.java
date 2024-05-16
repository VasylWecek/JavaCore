package chapter15;
// код демонстрирует использование ссылки на статический метод в Java
public class MethodRefDemo {

    // Функциональный интерфейс для обработки строк
    interface StringFunc {
        String func(String n);
    }

    // Класс с методом для реверса строки
    static class MyStringOps {
        // Статический метод для реверса строки
        static String strReverse(String str) {
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

        // Использование ссылки на статический метод
        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}
