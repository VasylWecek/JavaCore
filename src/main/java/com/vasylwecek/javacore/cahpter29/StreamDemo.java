package cahpter29;
import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        // создать ссылочный массив значений типа Iteger
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(8);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println("Исходный список: " + myList);

        // получить поток элементов списочного массива
        Stream<Integer> myStream = myList.stream();

        // получить минимальное и максимальное значения, вызвов
        // методы min(), max(), isPresent(), get()
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent()) System.out.println(
                "Минимальное значение: " + minVal.get()
        );

        // непременно получить новый поток данных, поскольку
        // предыдущий вызов метода min() стал оконченой операцией,
        // употребившый поток данных
        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent()) System.out.println(
                "Максимальное значение: " + maxVal.get()
        );

        // отмортировать поток данных, вызвав метод sorted()
        Stream <Integer> sortedStream = myList.stream().sorted();

        // отобразить отсортированый поток данных, вывзвав метод forEach()
        System.out.print("отсортированый поток данных: ");
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        // вывести только нечетные целочисленные значения,
        // вызвав метод filter()
        Stream<Integer> oddVals =
                myList.stream().sorted().filter((n) -> (n % 2) == 1);
        System.out.println("Нечетные значения: ");
        oddVals.forEach((n) -> System.out.println(n + " "));
        System.out.println();


        // Вывести только те нечетные значения целочисленные,
        // которые больше 5
        oddVals = myList.stream().filter( (n) -> (n%2) ==1).filter((n) -> n > 5);
        System.out.print("Heчeтныe значения больше 5:");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();
    }
}
