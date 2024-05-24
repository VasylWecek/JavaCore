package chapter18.ArrayExample;

import java.util.ArrayList;

/***
 * Эффективность (Временная сложность «О» большое):
 *  Индексирование:
 *      Линейный массив: O(1);
 *      Динамический массив: O(1);
 *   Поиск:
 *      Линейный массив: O(n);
 *     Динамический массив: O(n);
 *  Оптимизированный поиск:
 *  Линейный массив: O(log n);
 *  Динамический массив: O(log n);
 */
public class DynamicArrayExample {
    public static void main(String[] args) {
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.add(40);
        dynamicArray.add(50);

        for(int i = 0; i< dynamicArray.size(); i++){
            System.out.println(i + ": " + dynamicArray.get(i));
        }
    }
}
