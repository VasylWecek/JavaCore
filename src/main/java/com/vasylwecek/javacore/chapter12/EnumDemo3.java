package chapter12;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Яблoкo сорта Winesap стоит - " + + Apple.Winesap.getPrice() + " центов.\n");

        System.out.println("Цeны на все сорта яблок : ");
        for (Apple a : Apple.values())
            System.out.println(a + " стоит - " + a.getPrice() + " центов");
    }


    static enum Apple{
        Jonathan(10), GoldeDel(9), RedDel(12), Winesap(15), Cortland(8);

        private int price;
        Apple(int p) {price = p;}
        int getPrice() {return price;}

    }
}
