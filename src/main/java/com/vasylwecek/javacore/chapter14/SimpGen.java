package chapter14;
//Простой обобщенный класс с двумя параметрами типа: Т и V
class TwoGen<T, V>{
    T ob1;
    V ob2;

    TwoGen(T o1, V o2){
        ob1 = o1;
        ob2 = o2;
    }

    void showType(){
        System.out.println("Typ T: " +ob1.getClass().getName());
        System.out.println("Typ V: " + ob2.getClass().getName());

    }

    T getob1(){
        return ob1;
    }

    V getob2(){
        return ob2;
    }
}

public class SimpGen {
    public static void main(String args[]){
        TwoGen<Integer, String> tgObj =
                new TwoGen<Integer, String>(88, "Обобщения");

        tgObj.showType();

        // Получить и показать значения
        int v = tgObj.getob1();
        System.out.println("Знaчeниe: " + v);

        String str = tgObj.getob2();
        System.out.println("Знaчeниe: " + str);
    }
}
