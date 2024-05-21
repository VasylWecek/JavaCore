package chapter18;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(5);
        pq.add(1);
        pq.add(3);
        pq.add(2);
        pq.add(4);

        // Извлечение элементов из очереди в порядке приоритета
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }


        PriorityQueue<Integer> reversePq = new PriorityQueue<>(Comparator.reverseOrder());

        // Ввод элементов в очередь
        reversePq.add(5);
        reversePq.add(1);
        reversePq.add(3);
        reversePq.add(2);
        reversePq.add(4);

        // Извлечение элементов из очереди в обратном порядке
        while (!reversePq.isEmpty()) {
            System.out.println(reversePq.poll());


        }
    }
}