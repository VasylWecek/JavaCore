package chapter15;

public class LambdaExceptionDemo {
    // Функциональный интерфейс с методом, который может выбрасывать исключение
    interface DoubleNumericArrayFunc {
        double func(double[] n) throws EmptyArrayException;
    }

    // Пользовательское исключение для пустого массива
    static class EmptyArrayException extends Exception {
        EmptyArrayException() {
            super("Массив пуст");
        }
    }

    public static void main(String[] args) {
        double[] values = {1.0, 2.0, 3.0, 4.0};

        // Лямбда-выражение для вычисления среднего значения массива
        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;

            if (n.length == 0) {
                throw new EmptyArrayException();
            }

            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }

            return sum / n.length;
        };

        try {
            System.out.println("Среднее равно " + average.func(values));
            System.out.println("Среднее равно " + average.func(new double[0]));
        } catch (EmptyArrayException e) {
            System.out.println(e.getMessage());
        }
    }
}
