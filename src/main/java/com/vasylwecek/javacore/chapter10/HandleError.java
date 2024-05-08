package chapter10;
import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        Random rand = new Random();
        int a=0, b=0, c=0;

        for (int i=0; i<32000; i++) {
            try {
                b = rand.nextInt(); // рандомное число
                c = rand.nextInt();
                a = 12345 / (b/c);
            } catch (ArithmeticException e ){
                System.out.println("Деление на ноль.");
                a = 0; // присвоить нуль и продолжить работу
            }
            System.out.println("a: " + a);
        }
    }
}
