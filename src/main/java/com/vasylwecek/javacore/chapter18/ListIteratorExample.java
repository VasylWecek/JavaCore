package chapter18;

import java.util.LinkedList;
import java.util.ListIterator;
public class ListIteratorExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        ListIterator<String> listIterator = list.listIterator();

        // Перебор вперед
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.println(element);
        }

        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println(element);
        }
    }
}
