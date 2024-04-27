package chapter01;/*
демонстрируется работа цикла for
*/

public class BlockTest {
    public static void main(String[] args) {
        int x, y;

        y = 20;

        for (x = 0; x<10; x++){ // Условие: Цикл выполняется пока x меньше 10.

            /*
            Тело цикла:
            Выводится текущее значение x в консоль.
            Выводится текущее значение y в консоль.
            После вывода y его значение уменьшается на 2 (y = y - 2).
             */
            System.out.println("Знaчeниe х: " + x);
            System.out.println("Знaчeниe y: " + y);
            y = y - 2;
        }
    }
}