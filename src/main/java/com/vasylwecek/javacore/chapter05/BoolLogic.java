package chapter05;
/*
BoolLogic демонстрирует работу с логическими операциями на основе булевых переменных.
 */

public class BoolLogic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b; //логическое ИЛИ (|) между a и b. Поскольку a истинно, результат также истинен (true).
        boolean d = a & b; //логическое И (&) между a и b. Так как b ложно, результат ложен (false).
        boolean e = a ^ b; // логическое исключающее ИЛИ (^) между a и b. Поскольку a и b различны, результат истинен (true).
        boolean f = (!a & b) | ( a & !b); // комбинация отрицания, логического И и ИЛИ. Так как a истинно, !a ложно, а !b истинно. Таким образом, выражение превращается в false | true, что дает истинный
        boolean g = !a; // логическое отрицание (!) переменной a. Поскольку a истинно, результат ложен (false).

        System.out.println("                    a = " + a);
        System.out.println("                    b = " + b);
        System.out.println("                  a|b = " + c);
        System.out.println("                a & b = " + d);
        System.out.println("                a ^ b = " + e);
        System.out.println(" (!a & b) | ( a & !b) = " + f);
        System.out.println("                    !a = " + g);

    }
}
