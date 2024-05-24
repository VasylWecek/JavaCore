package chapter15;
// Продемонстрировать применение простого лямбда-выражения
public class LambdaDemo {
    interface MyNumber{
        double getValue();
    }

    public static void main(String[] args) {
        MyNumber myNum; // объявить ссылку на функциональный интерфейс

        /*
        Здесь лямбда-выражение просто является константным выражением.
        Когда оно присваивается ссылочной переменной myNum, получается
        экземпляр класса, в котором лямбда-выражение реализует
        метод getValue() из функционального интерфейса MyNumber
         */

        myNum = () -> 123.45;

        // вызвать метод qetValue(), предоставляемый
        // присвоенным ранее лямбда-выражением
        System.out.println("Фиксированное значение:  " + myNum.getValue());

        // А здесь используется более сложное выражение

        myNum = () -> Math.random() * 100;

        // В следующих строках кода вызывается лямбда-выражение
        // из предыдущей строки кода

        System.out.println("Cлyчaйнoe значение: " + myNum.getValue());
        System.out.println("Еще одно случайное значение: " + myNum.getValue());

        // Лямбда-выражение должно быть совместимо с абстрактным методом,
        // определяемым в функциональном интерфейсе . Поэтому следующая
        // строка кода ошибочна:
        // myNum = () -> "123.03"; // ОШИБКА!
    }

}