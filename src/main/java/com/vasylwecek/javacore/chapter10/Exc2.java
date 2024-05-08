package chapter10;

/**
 * Использование блоков операторов try и catch
 */

public class Exc2 {
    public static void main(String[] args) {
        int d, a;

        try {// проконтролировать блок кода
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет выведено.");
        } catch (ArithmeticException e) { // перехват ошибки деления на ноль
            System.out.println("Деление на ноль.");
        }
        System.out.println("После оператора catch.");
    }
}