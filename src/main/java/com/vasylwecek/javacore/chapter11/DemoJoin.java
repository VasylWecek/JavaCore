package chapter11;

// Класс, реализующий интерфейс Runnable для запуска в отдельных потоках
class NewThread3 implements Runnable {
    String name;

    Thread t;

    NewThread3(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Hoвый поток: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен");

    }
}
public class DemoJoin {
    public static void main(String args[]){
        //три отдельных помощника
        NewThread3 ob1 = new NewThread3("Один");
        NewThread3 ob2 = new NewThread3("Два");
        NewThread3 ob3 = new NewThread3("Три");

        System.out.println("Пoтoк Один запущен: "
        + ob1.t.isAlive());
        System.out.println("Пoтoк Два запущен: "
        + ob2.t.isAlive());
        System.out.println("Пoтoк Три запущен: "
        + ob3.t.isAlive());

        try {
            System.out.println("Ожидание завершения потоков");
            //join: Позволяет главному потоку подождать, пока каждый помощник закончит свою задачу.
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Глaвный поток прерван");
        }
        // isAlive: Проверяет, работает ли поток еще.
        System.out.println("Пoтoк Один запущен: "
        + ob1.t.isAlive());
        System.out.println("Пoтoк Два запущен: "
        + ob2.t.isAlive());
        System.out.println("Пoтoк Три запущен: "
        + ob3.t.isAlive());

        System.out.println("Глaвный поток завершен.");
        }
    }

