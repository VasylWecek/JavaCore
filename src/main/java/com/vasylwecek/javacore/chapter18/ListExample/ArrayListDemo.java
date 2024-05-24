package chapter18.ListExample;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        System.out.println("Начальный размер списочного массива al: " + al.size());


        al.add("S");
        al.add("A");
        al.add("L");
        al.add("T");
        al.add("O");
        al.add(5, "S2");

        System.out.println("Размер списочного массива al после ввода элементов: " + al.size());

        System.out.println("Содержимое списочного массива al: " + al);

        al.remove("S");
        al.remove("4");

        System.out.println("Размер списочного массива al после удаления элементов: " + al.size());

        System.out.println("Содержимое списочного массива al: " + al);
    }
}
