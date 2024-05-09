package chapter11;

public class CurrentThreadDemo {
    public static void main(String args[]){
        Thread t = Thread.currentThread();

        System.out.println("\nTeкyщий поток исполнения: " + t);

        t.setName("My Thread"); // изменения внугреннего имени потока исполнения
        System.out.println("Пocлe изменения имени потока: " + t);

        try{
            for (int n = 5; n > 0; n--){
                System.out.println(n);
                Thread.sleep(1000); // задает время задержки в миллисекундах
            }
        }catch (InterruptedException e){
            System.out.printf("Глaвный поток исполнения прерван");
        }
    }
}
