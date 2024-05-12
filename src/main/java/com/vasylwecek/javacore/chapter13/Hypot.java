package chapter13;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Hypot {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;
        side1 = 3.0;
        side2 = 4.0;

        /*
        Обратите внимание на то, что имена методов sqrt() и pow()
        должны быть уточнены именем их класса - Мath
         */

        hypot = sqrt(pow(side1, 2) + pow(side2, 2));

        System.out.println("Пpи заданной длине сторон " +
                side1 + " i " + side2 + " = " + hypot);
    }
}
