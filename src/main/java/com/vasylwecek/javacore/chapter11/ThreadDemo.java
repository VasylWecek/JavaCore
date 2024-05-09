package chapter11;

// Класс NewThread реализует интерфейс Runnable, что позволяет его экземплярам быть исполняемыми потоками.
class NewThread implements Runnable {
    Thread t;

    // Конструктор класса NewThread.
    NewThread() {
        // Создание нового потока исполнения. "this" относится к экземпляру NewThread, который реализует Runnable.
        t = new Thread(this, "Демонстрационный поток");
        // Вывод информации о созданном потоке.
        System.out.println("Дочерний поток создан: " + t);
        // Запуск потока, что приведет к вызову метода run().
        t.start();
    }

    // Метод run, который будет исполняться в новом потоке.
    public void run() {
        try {
            // Цикл, который печатает значения от 5 до 1 и засыпает на 500 миллисекунд.
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            // Обработка исключения, если поток был прерван во время сна.
            System.out.println("Дочерний поток прерван.");
        }
        // Вывод сообщения после завершения выполнения цикла.
        System.out.println("Дочерний поток завершен.");
    }
}

// Основной класс с методом main.
public class ThreadDemo {
    public static void main(String args[]) {
        // Создание нового потока через конструктор NewThread.
        new NewThread();

        try {
            // Цикл, который печатает значения от 5 до 1 и засыпает на 1000 миллисекунд в главном потоке.
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // Обработка исключения, если главный поток был прерван во время сна.
            System.out.println("Главный поток прерван.");
        }
        // Вывод сообщения после завершения выполнения цикла в главном потоке.
        System.out.println("Главный поток завершен.");
    }
}
