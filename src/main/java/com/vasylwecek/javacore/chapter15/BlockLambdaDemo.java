package chapter15;

public class BlockLambdaDemo {
    interface NumericFunc{
        int func(int n);
    }

    public static void main(String[] args) {
        // Это блочное лямбда-выражение вычисляет
        // факториал целочисленного значения
        NumericFunc factorial = (n) -> { // Создание переменной factorial типа NumericFunc и присвоение ей лямбда-выражения.
            int result = 1;

            for ( int i = 1; i <= n; i++)
                result = i * result;

            return result;
        };

        System.out.println("Фaктopиaл числа З равен " + factorial.func(3));
        System.out.println("Фaктopиaл числа 5 равен " + factorial.func(5));
    }
}
