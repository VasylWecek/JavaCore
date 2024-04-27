package chapter04;

/**
 * Char
 * Для представления символов типа char в Java используется кодировка в Юникод (Unicode)
 *
 * Для хранения этих символов требуется 16 бит, и поэтому вjava тип char является 16-разрядным.
 */
public class CharDemo {
    public static void main(String[] args) {
        char ch1, ch2;

        ch1 = 88; // код символа Х
        ch2 = 'Y';

        System.out.print("ch1 and ch2: ");
        System.out.println(ch1 + " " + ch2);
    }

}


