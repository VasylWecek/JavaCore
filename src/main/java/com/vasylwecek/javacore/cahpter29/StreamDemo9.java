package cahpter29;
import java.util.*;
import java.util.stream.*;

public class StreamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");
        myList.add("F");

        Stream<String> myStream = myList.stream();

        Spliterator<String> spliterator = myStream.spliterator();

        while (spliterator.tryAdvance((n) ->System.out.println(n)));
    }
}
