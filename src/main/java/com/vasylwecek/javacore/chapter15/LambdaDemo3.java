package chapter15;
// Продемонстрировать применение лямбда-выражения ,
// принимающего два параметра
public class LambdaDemo3 {

    interface NumericTest2{
        boolean test(int n, int d);
    }

    public static void main(String[] args) {
        //В этом лямбда-выражении проверяется, является ли
        //одно число множителем другого
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;

        if(isFactor.test(10, 2))
            System.out.println("Чиcлo 2 является множителем числа 10");

        if(!isFactor.test(10, 3))
            System.out.println("Чиcлo З не является множителем числа 10");


    }

}
