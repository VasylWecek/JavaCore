package chapter15;

public class ConstructorRefDemo {
    // Функциональный интерфейс с методом, который создает экземпляр MyClass
    interface MyFunc {
        MyClass func(int n);
    }

    // Класс с конструкторами
    static class MyClass {
        private int val;

        MyClass(int v) {
            val = v;
        }

        MyClass() {
            val = 0;
        }

        int getVal() {
            return val;
        }
    }

    public static void main(String[] args) {
        // Создание ссылки на конструктор MyClass
        MyFunc myClassCons = MyClass::new;

        // Создание экземпляра MyClass с использованием ссылки на конструктор
        MyClass mc = myClassCons.func(100);

        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
