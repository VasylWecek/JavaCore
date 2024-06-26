package chapter28;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.*;

// класс RecursiveTask исрользуеться для вычисления суммы

// Класс Sum1 наследует RecursiveTask<Double> и используется для вычисления суммы элементов массива
class Sum1 extends RecursiveTask<Double> {

    final int seqThreshold = 500; // Порог для последовательного выполнения

    double [] data;

    int start, end; // Начальный и конечный индексы диапазона

    Sum1(double[] vals, int s, int e){
        data  = vals;
        start = s;
        end = e;
    }

    protected Double compute (){
        double sum = 0;
// Если количество элементов меньше порога, выполняется последовательное вычисление
        if (end - start < seqThreshold){
            for (int i = start; i < end; i++) sum += data[i];
        }
        else {
            int middle = (start + end) / 2;

            Sum1 subTaskA = new Sum1(data, start, middle);
            Sum1 subTaskB = new Sum1(data, middle, end);

            subTaskA.fork();
            subTaskB.fork();

            sum = subTaskA.join() + subTaskB.join();
        }

        return sum;
    }
}
public class RecursiveTaskDemo {
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool ();

        double [] nums = new double [5000];

        for (int i = 0; i < nums.length; i++)
            nums[i] = (double) (((i%2) ==0) ? i : -i);

        Sum1 task = new Sum1(nums, 0, nums.length);

        double summation = fjp.invoke(task);
        System.out.println("Summation: " + summation);
    }
}
