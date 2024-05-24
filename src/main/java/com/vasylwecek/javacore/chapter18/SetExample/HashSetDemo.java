package chapter18.SetExample;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Etha");
        hs.add("Gamma");
        hs.add("Delta");
        hs.add("Epsilon");
        System.out.println(hs);
    }
}
