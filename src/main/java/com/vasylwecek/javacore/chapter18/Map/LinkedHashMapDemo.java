package chapter18.Map;
import java.util.*;
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> lhm = new LinkedHashMap<String, Double>();

        lhm.put("Джон Доу", 3434.34);
        lhm.put("Том Смит", 123.22);
        lhm.put("Джейн Бейкер", 1378.00);
        lhm.put("Тод Холл", 99.22);
        lhm.put("Ральф Смит", -19.08);

        //Получение и вывод множества записей
        Set<Map.Entry<String, Double>> set = lhm.entrySet();
        for (Map.Entry<String, Double> entry : set) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

        }
        System.out.println();

        double balance = lhm.get("Джон Доу");
        lhm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " + lhm.get("Джон Доу"));

    }
}
