package chapter07;

class Factorial {
    // Рекурсивный метод для вычисления факториала
    int fact(int n) {
        if (n <= 1) return 1; // Базовый случай рекурсии
        return fact(n - 1) * n; // Рекурсивный вызов
    }
}

class Recursion {
    public static void main(String args[]) {
        Factorial f = new Factorial();

        // Вывод результатов вычисления факториала
        System.out.println("Факториал 3 равен " + f.fact(3));
        System.out.println("Факториал 4 равен " + f.fact(4));
        System.out.println("Факториал 5 равен " + f.fact(5));
    }
}
