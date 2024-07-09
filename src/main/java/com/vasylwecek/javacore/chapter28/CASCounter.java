package chapter28;

import java.util.concurrent.atomic.AtomicInteger;

public class CASCounter {
    private final AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        int prev, next;
        do {
            prev = counter.get(); // читаем текущее значение
            next = prev + 1; // вычисляем новое значение
        } while (!counter.compareAndSet(prev, next)); // CAS: если текущее значение равно ожидаемому, устанавливаем новое значение
    }

    public int getCounter() {
        return counter.get();
    }

    public static void main(String[] args) {
        CASCounter counter = new CASCounter();
        // Многопоточное инкрементирование счетчика
        for (int i = 0; i < 10; i++) {
            new Thread(counter::increment).start();
        }

        // Задержка для завершения всех потоков (для демонстрации, лучше использовать CountDownLatch в реальном коде)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + counter.getCounter());
    }
}
