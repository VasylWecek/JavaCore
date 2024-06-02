package chapter10;

public class IndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        int[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Trying to call 110th element of array: ");
        System.out.println(integers[10]);
    }
}
