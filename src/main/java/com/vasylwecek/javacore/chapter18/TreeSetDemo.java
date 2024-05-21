package chapter18;
import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("B");
        ts.add("A");
        ts.add("C");
        ts.add("E");
        ts.add("D");

        System.out.println(ts);

        System.out.println(ts.subSet("C", "E"));

    }
}
