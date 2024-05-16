package chapter15;

public class ConstructorRefDemo3 {
    // Реализовать простую фабрику классов, используя ссылку на конструктор
    interface MyFunc<R, T>{
        R func(T n);
    }

    //Простой обобщенный класс
    static class MyClass<T> {
        private T val;

        //Конструктор, принимающий один параметр
        MyClass(T v){
            val = v;
        }

        //Конструктор по умолчанию. Этот конструктор в
        //данной программе НЕ используется
        MyClass() {
            val = null;
        }

        T getVal() {
            return val;
        };
    }

    static class MyClass2{
        String str;

        // Конструктор, принимающий один аргумент
        MyClass2(String s){
            str = s;
        }

        //Конструктор по умолчанию. Этот конструктор в
        //данной программе НЕ используется
        MyClass2() {
            str = "";
        }
        String getVal() {
            return str;
        };
    }


        //Фабричный метод для объектов разных классов.
        //  У каждого класса должен быть свой конструктор,
        // принимающий один параметр типа Т . А параметр R
        // обозначает тип создаваемого объекта

        static<R, T> R myClassFactory(MyFunc<R, T> cons, T v){
            return cons.func(v);
        }

    public static void main(String[] args) {
        // Создать ссылку на конструктор класса MyClass
        // В данном случае оператор new обращается к конструктору,
        // принимающему аргумент

        MyFunc<MyClass<Double>, Double> myClassCons = MyClass<Double>::new;

        //создать экземпляр типа класса МyClass, используя фабричный метод
        MyClass<Double> mc = myClassFactory(myClassCons, 100.1);

        //11 использовать только что созданный экземпляр класса МyClass
        System.out.println(
                "Значение val в объекте mc равно " + mc.getVal());

        // А теперь создать экземпляр другого класса ,
        // используя метод JDYClassFactory()

        MyFunc<MyClass2, String> myClassCons2 = MyClass2::new;

        MyClass2 mc2 = myClassFactory(myClassCons2, "Лямбда");

        System.out.println("Значение str в объекте mc2 равно " + mc2.getVal());
    }
}
