package chapter11;

// Главный класс с основным методом main
public class MultiThreadDemo {
    public static void main(String[] args) {
        // Создаем и запускаем три отдельных потока, используя класс NewThread2
        new NewThread2("Один");
        new NewThread2("Два");
        new NewThread2("Три");

        // Главный поток программы выполняет задержку в 1 секунду, прежде чем завершиться
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // Обработка исключения, если главный поток прерван
            System.out.println("Главный поток прерван.");
        }

        // Сообщение о завершении главного потока
        System.out.println("Главный поток завершен.");
    }
}

// Класс, который реализует интерфейс Runnable и создает свои собственные потоки
class NewThread2 implements Runnable {
    String name; // Имя потока
    Thread t; // Объект класса Thread, представляющий поток

    // Конструктор, который создает и запускает поток
    NewThread2(String threadname) {
        name = threadname; // Устанавливаем имя потока
        t = new Thread(this, name); // Создаем новый поток, передавая себя (this) как Runnable
        System.out.println("Новый поток: " + t); // Информируем о создании потока
        t.start(); // Запускаем поток, вызывая метод start
    }

    // Метод run, который будет выполняться в потоке
    public void run() {
        try {
            // Цикл с отсчетом от 5 до 1 с задержкой в 1000 миллисекунд
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000); // Засыпаем на 1000 миллисекунд
            }
        } catch (InterruptedException e) {
            // Обработка исключения, если поток был прерван
            System.out.println(name + " прерван.");
        }

        // Сообщение о завершении потока
        System.out.println(name + " завершен.");
    }
}
