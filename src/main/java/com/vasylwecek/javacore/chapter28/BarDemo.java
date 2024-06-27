package chapter28;
import java.util.concurrent.*;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

        System.out.println("Запуск потоков");

        new MyThread1(cb, "A");
        new MyThread1(cb, "B");
        new MyThread1(cb, "C");
    }
}

class MyThread1 implements Runnable{
    CyclicBarrier cbar;
    String name;

    MyThread1(CyclicBarrier c, String n){
        cbar = c;
        name = n;
        new Thread(this).start();
    }

    public void run(){
        System.out.println(name);

        try {
            cbar.await();
        }catch (BrokenBarrierException exc){
            System.out.println(exc);
        }catch (InterruptedException exc){
            System.out.println(exc);
        }
    }
}

class BarAction implements Runnable{
    public void run(){
        System.out.println("Бapьep достигнут!");
    }
}
