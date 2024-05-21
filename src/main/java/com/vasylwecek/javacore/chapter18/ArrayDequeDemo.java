package chapter18;
import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> aq = new ArrayDeque<>();

        aq.push("A");
        aq.push("B");
        aq.push("D");
        aq.push("D");
        aq.push("E");
        aq.push("F");

        System.out.println("Извлечение из стека: ");
        while (aq.peek() != null){
            System.out.println(aq.pop() + " ");
        }
        System.out.println();
    }
}
