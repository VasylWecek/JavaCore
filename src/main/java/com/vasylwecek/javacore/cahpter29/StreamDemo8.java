package cahpter29;
import java.util.*;
import java.util.stream.*;

public class StreamDemo8 {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");
        myList.add("F");

        Stream<String> myStream = myList.stream();


        Iterator<String> itr = myStream.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
