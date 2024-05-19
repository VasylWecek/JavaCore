package ECF;

import java.util.*;

public class Задание1 {
    public static int[] findIndex(int[] array, int target){
        Map<Integer, Integer> valueOfIndex = new HashMap<>();

        for ( int i =0; i < array.length; i++) {
            int num = array[i];

            int component = target  - num;
            if (valueOfIndex.containsKey(component)) {
                return new int[]{valueOfIndex.get(component), i};
            }

            valueOfIndex.put(num, i);
        }

        throw new IllegalArgumentException();





    }

    public static void main(String[] args) {
        int [] array = {3, 8, 15, 17};
        int target = 23;
        int[] result = findIndex(array, target);

        System.out.println("Index: " + result[0] + ", " + result[1]);
    }

}
