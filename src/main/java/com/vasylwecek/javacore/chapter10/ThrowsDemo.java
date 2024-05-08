package chapter10;

/**
 * Оператор throws
 *
 * тип имя_метода (список_параметров) throws список_исключений{
 *     //тело метода
 * }
 *
 * Здесь список_исключений обозначает разделяемый запятыми список исключений,
 * которые метод может сгенерировать.
 */
// Эта программа
//не подлежит компиляции , поскольку в ней отсугствует оператор throws,
//в котором объявляется неперехватываемое исключение.
public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода throwOne().");
        throw new IllegalAccessException("демонстрация");

    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }

}