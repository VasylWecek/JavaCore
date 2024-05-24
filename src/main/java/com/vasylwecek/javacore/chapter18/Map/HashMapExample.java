package chapter18.Map;

import java.util.HashMap;
import java.util.Map;
public class HashMapExample {
    public static void main(String[] args) {
        // Создание экземпляра HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Добавление элементов
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Вывод всех элементов
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Поиск элемента по ключу
        String value = map.get(2);
        System.out.println("Value for key 2: " + value);

        // Удаление элемента по ключу
        map.remove(3);
        System.out.println("Map after removing key 3: " + map);

        // Проверка наличия ключа
        boolean containsKey = map.containsKey(1);
        System.out.println("Map contains key 1: " + containsKey);

        // Проверка наличия значения
        boolean containsValue = map.containsValue("Two");
        System.out.println("Map contains value 'Two': " + containsValue);
    }
}
