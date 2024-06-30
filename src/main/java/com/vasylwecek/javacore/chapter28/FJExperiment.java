package chapter28;

import java.util.concurrent.*;

class Transform extends RecursiveAction {
    // Порог последовательного выполнения, передается через конструктор
    int seqThreshold;

    double[] data;
    int start, end;

    // Конструктор
    Transform(double[] vals, int s, int e, int t) {
        data = vals;
        start = s;
        end = e;
        seqThreshold = t;
    }

    // Метод, выполняющий вычисления
    @Override
    protected void compute() {
        if (end - start < seqThreshold) {
            // Последовательное выполнение, если диапазон меньше порога
            for (int i = start; i < end; i++) {
                if ((data[i] % 2) == 0)
                    data[i] = Math.sqrt(data[i]); // Квадратный корень для четных чисел
                else
                    data[i] = Math.cbrt(data[i]); // Кубический корень для нечетных чисел
            }
        } else {
            // Иначе, делим задачу на две части
            int middle = (start + end) / 2;
            invokeAll(new Transform(data, start, middle, seqThreshold),
                    new Transform(data, middle, end, seqThreshold));
        }
    }
}

public class FJExperiment {
    public static void main(String[] args) {
        int pLevel; // Уровень параллелизма
        int threshold; // Порог параллелизма

        // Проверка аргументов командной строки
        if (args.length != 2) {
            System.out.println("Usage: java FJExperiment pLevel threshold");
            return;
        }

        pLevel = Integer.parseInt(args[0]);
        threshold = Integer.parseInt(args[1]);

        long beginT, endT;

        // Создание пула потоков с заданным уровнем параллелизма
        ForkJoinPool fjp = new ForkJoinPool(pLevel);

        double[] nums = new double[1000000];

        // Заполнение массива
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }

        // Создание задачи Transform
        Transform task = new Transform(nums, 0, nums.length, threshold);

        // Измерение времени выполнения
        beginT = System.nanoTime();
        fjp.invoke(task);
        endT = System.nanoTime();

        // Вывод результатов
        System.out.println("Уровень параллелизма: " + pLevel);
        System.out.println("Порог параллелизма: " + threshold);
        System.out.println("Истекшее время: " + (endT - beginT) + " нс");
    }
}
