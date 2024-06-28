package chapter28;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
        // Создание объекта ReentrantLock
        ReentrantLock lock = new ReentrantLock();
        // Создание и запуск двух потоков
        new LockThread(lock, "A");
        new LockThread(lock, "B");
    }
}
// Класс для общего ресурса, используемого потоками
class Shared1 {

    static int count = 0;   // общий счетчик
}

class LockThread implements Runnable {
    String name;
    ReentrantLock lock; // объект блокировки

    LockThread(ReentrantLock lk, String n) {
        lock = lk;
        name = n;
        new Thread(this).start(); // создание и запуск нового потока
    }

    public void run() {
        System.out.println("Запуск потока " + name);

        try {
            // Попытка захватить блокировку
            System.out.println("Поток " + name + " ожидает блокировки счетчика");
            lock.lock(); // захват блокировки
            System.out.println("Поток " + name + " блокирует счетчик.");
            // Увеличение общего счетчика
            Shared1.count++;
            System.out.println("Поток " + name + ": " + Shared1.count);

            System.out.println("Поток " + name + " ожидает");
            Thread.sleep(1000);
        } catch (InterruptedException exc) {
            System.out.println(exc);
        } finally {
            System.out.println("Поток " + name + " разблокирует счетчик");
            lock.unlock();
        }
    }
}
