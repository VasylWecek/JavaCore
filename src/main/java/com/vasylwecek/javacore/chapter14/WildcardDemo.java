/***
 * Этот пример демонстрирует использование метасимвола (wildcard) ? в
 * обобщениях Java, который позволяет работать с объектами, тип которых
 * неизвестен. В данном случае он используется для сравнения среднего
 * значения массивов различных типов чисел (Integer, Double, Float).
 */

package chapter14;
class Stats<T extends Number> {
    T[] nums; // массив класса Number или его подкласса

    // Конструктор, принимающий массив элементов типа T
    Stats(T[] o) {
        nums = o;
    }

    // Метод для вычисления среднего значения элементов массива
    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    // Метод для сравнения среднего значения с другим объектом Stats
    boolean sameAvg(Stats<?> ob) {
        return average() == ob.average();
    }
}

/**
 * T extends Number: Ограничение типа T, которое гарантирует, что T будет подклассом Number. Это позволяет использовать методы класса Number, такие как doubleValue().
 * T[] nums: Поле, содержащее массив элементов типа T.
 * Stats(T[] o): Конструктор, принимающий массив элементов типа T и присваивающий его полю nums.
 * double average(): Метод, вычисляющий среднее значение элементов массива.
 * boolean sameAvg(Stats<?> ob): Метод, сравнивающий среднее значение текущего объекта Stats с другим объектом Stats любого типа.
 */
public class WildcardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("Среднее значение iob равно " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<>(dnums);
        double w = dob.average();
        System.out.println("Среднее значение dob равно " + w);

        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<>(fnums);
        double x = fob.average();
        System.out.println("Среднее значение fob равно " + x);

        System.out.print("Средние значения iob и dob ");
        if (iob.sameAvg(dob)) {
            System.out.println("равны");
        } else {
            System.out.println("отличаются");
        }

        System.out.print("Средние значения iob и fob ");
        if (iob.sameAvg(fob)) {
            System.out.println("одинаковы");
        } else {
            System.out.println("отличаются");
        }
    }
}
