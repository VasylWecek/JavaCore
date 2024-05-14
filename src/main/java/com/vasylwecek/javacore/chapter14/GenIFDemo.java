package chapter14;

// Пример применения обобщенного интерфейса
// Обобщенный интерфейс МinМах для определения
// минимального и максимального значений
interface MinMax<T extends Comparable<T>>{
    T min();
    T max();
}

// реализовать обобщенный интерфейс МinMax
class MyClass<T extends Comparable<T>> implements MinMax<T>{
    T[] vals;

    MyClass (T[] o){vals =o;}

    // возвратить минимальное значение из массива vals
    public T min(){
        T v = vals[0];

        for (int i=1; i<vals.length; i++)
            if (vals[i].compareTo(v) < 0) v = vals[i];

        return v;
    }

    // возвратить .максимальное значение из массива vals
    public T max(){
        T v = vals[0];

        for (int i=1; i<vals.length; i++)
            if (vals[i].compareTo(v) > 0) v = vals[i];

        return v;
    }
}
public class GenIFDemo {
    public static void main(String[] args) {
        Integer inums[] = {3, 6, 2, 8, 6};
        Character chs[] = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Character> chc = new MyClass<Character>(chs);

        System.out.println("Maкcимaльнoe значение в массиве inums: " +
                iob.max());
        System.out.println("МИНимaльнoe значение в массиве inums: " +
                iob.min());

        System.out.println("Maкcимaльнoe значение в массиве chs: " +
                chc.max());
        System.out.println("Минимaльнoe значение в массиве chs: " +
                chc.min());
    }
}
