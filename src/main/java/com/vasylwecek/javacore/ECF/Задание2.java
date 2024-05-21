package ECF;
import java.util.HashSet;
import java.util.Set;

public class Задание2 {
public static boolean containsDuplicate(int[] array) {
    Set<Integer> el = new HashSet<>();

    for (int i = 0; i < array.length; i++) {
        if(!el.add(array[i])){
            return true;
        }
    }

    return false;
}

    public static void main(String[] args) {
        int [] array1 = {4, 5, 6, 6, 8};
        System.out.println("Array " + java.util.Arrays.toString(array1) + " contains " + containsDuplicate(array1));
        int [] array2 = {4, 5, 6, 7, 8};
        System.out.println("Array " + java.util.Arrays.toString(array2) + " contains " + containsDuplicate(array2));
    }
}
