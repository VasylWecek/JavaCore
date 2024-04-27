package chapter03;

/**
 * Типы данных, переменные и массивы
 */

// Вычислить расстояние проходимое светом используя переменные типа long
/**
 * Тип long
 * Этот тип 64-разрядных целочисленных значений со знаком удобен в тех ситу­ациях, когда длины типа int недостаточно для хранения требуемого значения.
 */

class Light{
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186000;

        days = 1000;

        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;

        System.out.print("Za " + days);

        System.out.println(" дней свет пройдет около  ");

        System.out.println(distance + " миль");

    }
}