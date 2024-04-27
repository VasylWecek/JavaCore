package chapter08;

class RefDemo {
    public static void main(String args[]) {
        // Создание объекта класса BoxWeight
        Box4Weight1 weightbox = new Box4Weight1(3, 5, 7, 8.37);
        // Создание объекта класса Box
        Box4 plainbox = new Box4();
        double vol;

        // Получение объема коробки weightbox
        vol = weightbox.volume();
        System.out.println("Объем weightbox равен " + vol);
        System.out.println("Вес weightbox равен " + weightbox.weight);
        System.out.println();

        // Присваивание ссылки на объект BoxWeight ссылке на объект Box
        plainbox = weightbox;

        // Правильный вызов метода volume() через plainbox
        vol = plainbox.volume(); // Метод volume() определен в классе Box
        System.out.println("Объем plainbox равен " + vol);

        /* Следующий оператор ошибочен, так как член plainbox
        не определяет член weight, он является частью класса BoxWeight.
        Для доступа к weight необходимо использовать ссылку типа BoxWeight.
        */
        // System.out.println("Вес plainbox равен " + plainbox.weight); // Ошибка!
    }
}
