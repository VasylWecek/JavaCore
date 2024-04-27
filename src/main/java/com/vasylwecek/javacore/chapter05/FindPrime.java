package chapter05;

/**
 * FindPrime предназначена для определения,
 * является ли число простым. Простое число — это число,
 * которое делится только на 1 и на само себя, то есть имеет только два различных делителя.
 */
public class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;
        num = 14;


        if ( num < 2) isPrime = false;
        else isPrime = true;

        for ( int i =2; i <= num/i; i++){
            if ((num % i ) == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Пpocтoe число");
        else System.out.println("He простое число");
    }
}
