package chapter28;
import chapter16.MakeString;

import java.util.concurrent.Exchanger;

public class ExgrDemo {
    public static void main(String[] args) {
        Exchanger<String> exgr = new Exchanger<String>();
        new UseString(exgr);
        new MakeString1(exgr);
    }
}

class MakeString1 implements Runnable {
    Exchanger<String> ex;
    String str;
    MakeString1(Exchanger<String> c){
        ex = c;
        str = new String();
        new Thread (this).start();
    }

    public void run (){
        char ch = 'A';
        for (int i =0; i < 3; i++){
            // заполняем буфер
            for (int j = 0; j<5; j++)
                str += (char) ch++;
            try {
                str = ex.exchange(str);
                }catch (InterruptedException exc){
                System.out.println(exc);
            }
        }
    }
}

class UseString implements Runnable {
    Exchanger <String>  ex;
    String str;
    UseString(Exchanger <String> c){
        ex = c;
        new Thread(this).start();
    }

    public void run(){
        for (int i =0; i < 3; i++){
            try {
                // обменяй пустой на заполненый
                str = ex.exchange(new String());
                System.out.println("str = " + str);
            }catch (InterruptedException exc){
                System.out.println(exc);
            }
        }
    }
}
