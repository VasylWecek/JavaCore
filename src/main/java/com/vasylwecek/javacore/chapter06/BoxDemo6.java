package chapter06;

/* В данном примере программы для инициализации размеров
   параллелепипеда в классе Box применяется конструктор
*/


class BoxDemo6 {
    public static void main(String args[]) {
        // объявить, выделить память и инициализировать объекты типа Box
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
    static class Box {
        double width;
        double height;
        double depth;

        // Это конструктор класса Box
        Box() {
            System.out.println("Конструирование объекта Box");
            width = 10;
            height = 10;
            depth = 10;
        }

        // рассчитать и возвратить объем
        double volume() {
            return width * height * depth;
        }
    }
}
