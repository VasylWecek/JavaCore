package chapter12;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Koнcтaнты перечислимого типа Apple:");

        Apple allapples[] = Apple.values(); //values() - возвращает массив всех констант в перечислении.
        for(Apple a : allapples)
            System.out.println(a);

        System.out.println();

        ap = Apple.valueOf("Winesap"); // valueOf: Получает конкретную константу из перечисления по ее имени, переданному в виде строки.
        System.out.println("Пepeмeннaя ар содержит " + ap);
    }



    static enum Apple{
        Jonathan, GoldenDel, RedDel, Winesap, Cortland
    }
}
