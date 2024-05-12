package chapter13;

/***
 *  демонстрируется использование оператора assert для проверки,
 *  что переменная n, получаемая от метода getnum(), всегда больше 0.
 */
public class AssertDemo {
    static int val = 3; // статическая переменная
    //возвратить целочисленное значение
    static int getnum(){
        return val--;
    }

    public static void main (String args[]){
        int n;
        for(int i=0; i<10; i++){
            n = getnum();

            assert n > 0; //не nодтвердится, если n == О

            System.out.println("n = " + n);
        }
    }
}
