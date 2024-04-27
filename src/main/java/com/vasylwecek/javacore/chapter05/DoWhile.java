package chapter05;

/**
Цикл do-while

 do {
 // тело цикла
 } while (условие);

 */
/*
DoWhile в Java демонстрирует использование цикла do-while,
который гарантирует, что тело цикла будет выполнено хотя бы один раз,
прежде чем будет проверено условие.
 */
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("такт " + n);
            n--;
        } while (n>0);
    }
}
