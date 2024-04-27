package chapter03;

public class TwoArray {
    public static void main(String[] args) {
        int twoD[][] = new int[4][5]; // Объявление и создание двумерного массива 4x5

        int i, j, k = 0;

        // Заполнение массива значениями
        for(i = 0; i < 4; i++) {
            for(j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        // Вывод содержимого массива
        for(i = 0; i < 4; i++) {
            for(j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println(); // Переход на новую строку после вывода каждого ряда
        }
    }
}