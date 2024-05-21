package chapter18;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.ListIterator;
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("C");
        list.add("A");
        list.add("E");
        list.add("B");
        list.add("D");
        list.add("F");

        // Использование итератора для вывода содержимого списочного массива
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element +" ");

        }
        System.out.println();

        // Использование ListIterator для изменения перебираемых объектов
        ListIterator<String> litr = list.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + " ");
        }

        // Вывод измененного содержимого списочного массива
        itr = list.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element+" ");
        }
        System.out.println();

        // Вывод списка в обратном порядке
        while(litr.hasNext()) {
            String element = litr.previous();
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
