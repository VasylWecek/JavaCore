package chapter11;

public class SuspendResume {
        public static void main(String[] args) {
            NewThread ob1 = new NewThread("Один");
            NewThread ob2 = new NewThread("Два");

            try {
                Thread.sleep(1000); // Подождем немного перед управлением потоками
                ob1.mysuspend(); // Приостановим первый поток
                System.out.println("Приостановка потока Один");
                Thread.sleep(1000);
                ob1.myresume(); // Возобновим первый поток
                System.out.println("Возобновление потока Один");

                ob2.mysuspend(); // Приостановим второй поток
                System.out.println("Приостановка потока Два");
                Thread.sleep(1000);
                ob2.myresume(); // Возобновим второй поток
                System.out.println("Возобновление потока Два");
            } catch (InterruptedException e) {
                System.out.println("Главный поток прерван");
            }

            // Ожидание завершения потоков
            try {
                ob1.t.join();
                ob2.t.join();
            } catch (InterruptedException e) {
                System.out.println("Главный поток прерван");
            }

            System.out.println("Главный поток завершен");
        }



    static class NewThread implements Runnable {
        String name;
        Thread t;
        boolean suspendFlag;


        NewThread (String threadname){
            name = threadname;
            t = new Thread(this, name);
            System.out.println("Hoвый поток: " + t);
            suspendFlag = false;
            t.start();
        }

        public void run(){
            try{
                for (int i = 15; i > 0; i--){
                    System.out.println(name + ": " + i);
                    Thread.sleep(200);
                    synchronized (this){
                        while(suspendFlag){
                            wait();
                        }
                    }
                }
            }catch (InterruptedException e){
                System.out.println(name + " прерван");
            }
            System.out.println(name + " завершен");
        }
        synchronized void mysuspend(){
            suspendFlag = true;
        }

        synchronized  void myresume(){
            suspendFlag = false;
            notify();
        }
    }
}
