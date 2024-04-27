package chapter05;

/**
 * switch ( выражение ) {
 *     case значение1:
 *     // последовательность операторов
 * break ;
 * case значение2:
 * // последовательность операторов
 *  * break ;
 *  ...
 *  ...
 *  ...
 *  case значениеN:
 *  // последовательность операторов
 *  break;
 *  default:
 *  // последовательность операторов п о умолчанию
 * }
 */

/*
Switch на Java демонстрирует использование оператора switch,
который позволяет управлять потоком выполнения программы с
помощью выбора из нескольких альтернатив.
 */
public class Switch {
    public static void main(String[] args) {


        for (int i = 0; i < 6; i++)
            /*
            этот цикл выполняется с начальным значением i = 0 и
            продолжается до тех пор, пока i меньше 6. С каждым
            проходом цикла значение i увеличивается на 1.
             */
            switch (i) {
                case 0:
                System.out.println(" i равно нулю");
                break;
                case 1:
                    System.out.println(" i равно 1");
                    break;
                case 2:
                    System.out.println(" i равно 2");
                    break;
                case 3:
                    System.out.println(" i равно 3");
                    break;
                default:
                    System.out.println(" i > 3");

            }
    }
}