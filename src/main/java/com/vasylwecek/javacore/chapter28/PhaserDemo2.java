package chapter28;

// расширить класс Phaser и переопредилить метод onAdvance()
// таким образом, чтобы было выполнено только опредиленное
// количество фаз

import java.util.concurrent.*;




public class PhaserDemo2 {
    public static void main(String[] args) {

        MyPhaser phsr = new MyPhaser(1, 4);
        System.out.println("Запуск потоков\n");

        new MyThread(phsr, "A");
        new MyThread(phsr, "B");
        new MyThread(phsr, "C");

        while (!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
        }
        System.out.println("Cинxpoнизaтop фаз завершен");
    }


    static class MyPhaser extends Phaser {
        int numPhases;

        MyPhaser(int parties, int phaseCount) {
            super(parties);
            numPhases = phaseCount - 1;
        }

        // Переопределить метод onAdvance(), чтобы выполнить определенное количество фаз
        @Override
        protected boolean onAdvance(int phase, int registeredParties) {
            // Следующий оператор println() требуется только для целей иллюстрации
            System.out.println("Фаза " + phase + " завершена.\n");
            // Возвратить логическое значение true, если все фазы завершены
            if (phase == numPhases || registeredParties == 0) {
                return true;
            }
            // В противном случае возвратить логическое значение false
            return false;
        }
    }

    static class MyThread implements Runnable{
        Phaser phsr;
        String name;

        MyThread(Phaser p, String n){
            phsr = p;
            name = n;
            phsr.getPhase();
            new Thread(this).start();
        }

        public void run(){

            while(!phsr.isTerminated()){
                System.out.println(
                        "Поток " + name + " начинвет фазу " + phsr.register()
                );
                phsr.arriveAndAwaitAdvance();


                try {
                    Thread.sleep(10);

                } catch (InterruptedException e){
                    System.out.println(e);
                }
            }
        }
    }
}