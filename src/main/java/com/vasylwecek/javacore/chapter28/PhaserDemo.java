package chapter28;
import java.util.concurrent.*;

public class PhaserDemo {
    public static void main(String[] args) {
        // Инициализация Phaser с 1, чтобы включить главный поток
        Phaser phsr = new Phaser(1);
        int curPhase;

        System.out.println("запуск потоков");

        // Создание и запуск трех потоков
        new MyThread(phsr, "A");

        new MyThread(phsr, "B");

        new MyThread(phsr, "C");

        // ожидаеть завершения всеми потоками исполнения первой фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // ожидаеть завершения всеми потоками исполнения второй фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // снять основной поток исполнения с регистрации
        phsr.arriveAndDeregister();

        // Проверка, завершен ли Phaser
        if (phsr.isTerminated())
            System.out.println("Cинxpoнизaтop фаз завершен");
    }

    static class MyThread implements Runnable {
        Phaser phsr;
        String name;

        MyThread(Phaser p, String n) {
            phsr = p;
            name = n;
            phsr.register();
            new Thread(this).start();
        }

        public void run() {
            // Начало первой фазы
            System.out.println("Поток " + name + " начинает первую фазу");
            phsr.arriveAndAwaitAdvance(); // известить о достижении фазы

            // Небольшая пауза, чтобы не нарушить порядок вывода.
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            // Начало второй фазы
            System.out.println("Поток " + name + " начинает вторую фазу");
            phsr.arriveAndAwaitAdvance();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            // Начало третьей фазы
            System.out.println("Поток " + name + " начинает третью фазу");
            phsr.arriveAndAwaitAdvance();
        }
    }
}


