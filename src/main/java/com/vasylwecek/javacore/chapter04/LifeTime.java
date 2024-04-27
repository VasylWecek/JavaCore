package chapter04;

// демонстрация действия переонной
public class LifeTime {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++){
            int  y =-1;
            System.out.println("y равино: " + y);

            y = 100;
            System.out.println("н теперь равно: " +y);
        }
    }
}
