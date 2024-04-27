package chapter04;

/**
 * Продемонстрировать применение значений типа Ьoolean
 *
 *
 */
public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println(" b equal " + b);
        b = true;
        System.out.println(" b equal " + b);


        // boolean with if

        if (b) System.out.println("This cod make. ");
        b = false;
        if(b) System.out.println("This cod not make. ");

        System.out.println("10 > 9 equal " + (10>9));
    }
}
