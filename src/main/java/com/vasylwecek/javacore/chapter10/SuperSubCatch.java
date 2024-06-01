package chapter10;
/*
Эта программа содержит ошибку.

В последовательности операторов catcg подкоасс исключений
должен быть указан перед его суперклассом, иначе это приведет к недостежимому коду
и ошибке во время компилации.
 */
public class SuperSubCatch {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 42/a;

        //} catch (Exception e){
            System.out.println("Перехват исключений общего класса Exception ");
        }
        /*
        Этот оператор catch вообще не будет достигнут, т.к. подкласс ArithmeticException
        являеться производным от класса Exception.
         */
        catch (ArithmeticException e) {// ОШИБКА: недостижный код!
            System.out.println("Этот код вообше недостижим.");
        }
    }
}
