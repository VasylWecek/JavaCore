package chapter18.ListExample;
import java.util.*;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Original array: " + al);

        Integer[] ia = new Integer[al.size()];
        ia= al.toArray(ia);


        int sum = 0;
        for (int i : ia){
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
