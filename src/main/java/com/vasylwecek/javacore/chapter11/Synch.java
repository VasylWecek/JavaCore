package chapter11;

// Главный поток создает объект Callme, который будет использоваться всеми тремя потоками.
class Callme{ // Класс для вызова
    synchronized void call(String msg){ // метод call не синхронизирован
        System.out.print("[" + msg);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Пpepвaнo");
        }
        System.out.println("]");
    }
}

//Главный поток создает три объекта Caller, каждый из которых запускает свой поток и вызывает метод call с разными сообщениями.
class Caller implements Runnable{ // Запускающий поток
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run () { // поток вызывает метод call объекта Callme, передавая сообщение.
        synchronized (target) {
            target.call(msg);
        }
    }
}
public class Synch {
    public static void main(String args[]) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Добро пожаловать");
        Caller ob2 = new Caller(target, "в синхронизированный");
        Caller ob3 = new Caller(target, "мир ! ");

        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Пpepвaнo");
        }
    }
}
