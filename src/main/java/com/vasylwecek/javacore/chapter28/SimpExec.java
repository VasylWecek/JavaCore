package chapter28;
import java.util.concurrent.*;

public class SimpExec {
    public static void main(String[] args) {
        // Создание четырех объектов CountDownLatch с начальными значениями 5
        CountDownLatch cdl = new CountDownLatch(5);
        CountDownLatch cdl2 = new CountDownLatch(5);
        CountDownLatch cdl3 = new CountDownLatch(5);
        CountDownLatch cdl4 = new CountDownLatch(5);

        // Создание ExecutorService с пулом из двух потоков
        ExecutorService es = Executors.newFixedThreadPool(2);

        System.out.println("Запуск потоков");

        // Запуск четырех потоков через ExecutorService
        es.execute(new MyThread(cdl, "A"));
        es.execute(new MyThread(cdl2, "B"));
        es.execute(new MyThread(cdl3, "C"));
        es.execute(new MyThread(cdl4, "D"));

        try {
            // Ожидание завершения всех потоков
            cdl.await();
            cdl2.await();
            cdl3.await();
            cdl4.await();
        }catch (InterruptedException exc) {
            System.out.println(exc);
        }

        // Завершение работы ExecutorService
        es.shutdown();
        System.out.println("Завершение потоков");
    }

    // Внутренний класс, реализующий Runnable
    static class MyThread implements Runnable{
        String name;
        CountDownLatch latch;



        MyThread(CountDownLatch c, String n){
            latch = c;
            name = n;

            // new Thread(this);
            // Вызов конструктора Thread не нужен, так как запуск потока осуществляется через ExecutorService
        }

        // Метод run(), выполняющий подсчет до 5 и уменьшающий CountDownLatch
        public void run (){
            for (int i =0; i<5; i++){
                System.out.println(name + ": " + i);
                latch.countDown();  // Уменьшение счетчика CountDownLatch
            }
        }
    }
}
