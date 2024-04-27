package chapter03;

public class Average {
    public static void main(String[] args) {
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5}; // Массив с числами
        double result = 0;
        int i;

        for(i = 0; i < nums.length; i++) {
            result += nums[i]; // Добавляем каждое число к result
        }

        double average = result / nums.length; // Вычисляем среднее
        System.out.println("Среднее значение равно " + average);
    }
}