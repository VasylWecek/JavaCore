package chapter28;

// Простой пример реализации стратегии "разделяй и властвуй".
// В данном примере применяеться класс RecursiveAction
import java.util.concurrent.*;
import java.util.*;

// Класс ForkJoinTask преобразует (через класс RecursiveAction)
// зевчения элементов массива типа double  в их квадратные корни

// Класс SqrtTransform преобразует значения элементов массива типа double в их квадратные корни

class SqrtTransform extends RecursiveAction {
    // Порог последовательной обработки
    final int seqThreshold = 1000;

    double [] data;

    int start, end;

    SqrtTransform(double [] vals, int s, int e) {
        data = vals;
        start = s;
        end = e;
    }

    // Метод, выполняющий вычисления
    protected void compute(){

        // Если количество элементов ниже порога, выполняем последовательную обработку
        if ((end - start) < seqThreshold){
            for (int i = start; i < end; i++){
                data[i] = Math.sqrt(data[i]);
            }
        }
        else {
            // Иначе, делим задачу на две части
            int middle = (start + end ) / 2;

            // Выполняем обе части параллельно
            invokeAll(new SqrtTransform(data, start, middle),
                    new SqrtTransform(data, middle, end));
        }
    }
}
public class ForkJoinDemo {
    public static void main(String[] args) {

        ForkJoinPool fjp = new ForkJoinPool();

        double[] nums = new double[100000];

        for (int i =0; i < nums.length; i++)
            nums[i] = (double)i;

        System.out.println("Чacть исходной последовательности: ");

        for ( int i = 0; i < 10; i++)
            System.out.println(nums[i] + " ");
        System.out.println("\n");

        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);

        fjp.invoke(task);

        System.out.println("Чacть преобразованной последовательности " +
                "(с точностью до четырех знаков после десятичной точки):");

        for (int i =0; i <10; i++)
            System.out.format("%.4f ", nums[i]);
        System.out.println();

    }
}
