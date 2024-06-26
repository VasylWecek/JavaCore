package chapter11;

public class PCFixed {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("Для остановки нажмите Ctrl-C.");
    }

    static class Q { //коробка
        int n;
        boolean valueSet = false;

        synchronized int get() {
            while (!valueSet) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Исключение InterruptedException перехвачено");
                }
            }
            System.out.println("Получено: " + n);
            valueSet = false;
            notifyAll();
            return n;
        }

        synchronized void put(int n) {
            while (valueSet) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Исключение InterruptedException перехвачено");
                }
            }
            this.n = n;
            valueSet = true;
            System.out.println("Отправлено: " + n);
            notifyAll();
        }
    }

    static class Producer implements Runnable {
        Q q;

        Producer(Q q) {
            this.q = q;
            new Thread(this, "Поставщик").start();
        }

        public void run() {
            int i = 0;
            while (true) {
                q.put(i++);
            }
        }
    }

    static class Consumer implements Runnable {
        Q q;

        Consumer(Q q) {
            this.q = q;
            new Thread(this, "Потребитель").start();
        }

        public void run() {
            while (true) {
                q.get();
            }
        }
    }
}
