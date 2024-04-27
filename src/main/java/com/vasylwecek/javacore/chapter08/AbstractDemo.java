package chapter08;

// Абстрактный класс A с абстрактным методом callme
abstract class A2 {
    abstract void callme();

    // Конкретный метод в абстрактном классе
    void callmetoo() {
        System.out.println("Это конкретный метод.");
    }
}

// Класс B расширяет абстрактный класс A и реализует метод callme
class B2 extends A2 {
    // Реализация метода callme
    void callme() {
        System.out.println("Реализация метода callme() из класса B.");
    }
}

// Демонстрационный класс для показа абстракции
class AbstractDemo {
    public static void main(String args[]) {
        B2 b2 = new B2(); // Создание экземпляра класса B

        b2.callme(); // Вызов переопределенного метода callme
        b2.callmetoo(); // Вызов метода callmetoo
    }
}
