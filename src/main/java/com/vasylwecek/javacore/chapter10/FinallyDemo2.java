package chapter10;
import java.util.Arrays;

public class FinallyDemo2 {
    public static void main(String[] args) {
        int[] intArray = new int[10];

        System.out.println("Filling our array");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        try {
            System.out.println("Element number 11: " + intArray[10]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("We have an exception here: " + ex);
        } finally {
            System.out.println("\n=================================================");
            System.out.println("intArray: " + Arrays.toString(intArray));
            System.out.println("=================================================\n");
        }
    }
}