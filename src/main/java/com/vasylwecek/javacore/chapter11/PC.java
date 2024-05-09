package chapter11;

/***
 * Проблемы текущего решения
 * Один за другим:
 * Прямо сейчас производитель просто кладет числа, не дожидаясь, пока потребитель их заберет.
 * В реальности это может привести к тому, что производитель перезапишет данные до того, как их заберут.
 *
 * Реальная синхронизация:
 * Обычно нужно управлять таким процессом, чтобы производитель ждал, пока потребитель заберет данные,
 * прежде чем положить новые.
 */
class Q{ // это та самая "комната", где производитель кладет вещи, а потребитель их забирает.
    int n;


    // Они защищены механизмом синхронизации,
    // чтобы одновременно только один человек мог или класть, или брать.
    synchronized int get(){
        System.out.println("Пoлyчeнo: " + n);
        return n;
    }

    synchronized void put(int n){
        this.n = n;
        System.out.println("Oтпpaвлeнo: " + n);
    }
}

class Producer implements Runnable{ // это человек, который приносит новые вещи и кладет их в комнату.
    Q q;

    Producer (Q q){
        this.q = q;
        new Thread(this, "Поставщик").start();
    }

    public void run(){
        int i = 0;

        while (true){
            q.put(i++);
        }
    }
}
class Consumer implements Runnable{ // это другой человек, который заходит в комнату и забирает эти вещи для использования.
    Q q;
    Consumer (Q q){
        this.q = q;
        new Thread(this, "Потребитель").start();
    }

    public void run(){
        while(true){
            q.get();
        }
    }
}
public class PC {
    public static void main(String[] args) {
Q q = new Q();
new Producer(q);
new Consumer(q);

        System.out.println("Для остановки нажмите Ctrl-C.");
    }
}
