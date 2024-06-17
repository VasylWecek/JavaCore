package cahpter29;
import java.util.*;
import java.util.stream.*;

public class StreamDemo2 {
    public static void main(String[] args) {
        // создать список обьектов типа Integer

        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(7);
        myList.add(8);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        // Два способа получения результата перемножения целочисленных
        // элементов списка myList с помощью метода reduce()
        Optional<Integer> productObj = myList.stream().reduce((a,b) -> a*b);
        if (productObj.isPresent()) System.out.println(
                "Пpoиэвeдeниe в виде объекта типа Optional: " +
                        productObj.get()
        );

        int prodcut = myList.stream().reduce(1, (a,b) -> a*b);

        System.out.println(
                "Произведение в виде значения типа int: " + prodcut
        );
    }
}
