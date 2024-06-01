package chapter10;

/*Операторы try могут быть неявно вложены в вызовы методов. */

class MethNestTry {
    static void nesttry(int a) {
        try {
            /* Если указан один аргумент, будет исключение из-за деления на нуль */
            if (a == 1) a = a / (a - a); // деление на нуль

            /* Если указаны два аргумента, будет исключение из-за выхода за пределы массива */
            if (a == 2) {
                int c[] = { 1 };
                c[42] = 99; // выход за пределы массива
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс за пределами массива: " + e);
        }
    }

    public static void main(String args[]) {
        try {
            int a = args.length;
            /* Если не указаны аргументы командной строки, будет исключение из-за деления на нуль */
            int b = 42 / a;
            System.out.println("a = " + a);
            nesttry(a);
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль: " + e);
        }
        System.out.println("После блока операторов try/catch.");
    }
}
