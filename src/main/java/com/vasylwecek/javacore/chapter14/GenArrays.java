package chapter14;

public class GenArrays {
    static class Gen<T extends Number>{
        T ob;
        T vals[];
        Gen (T o, T[] nums){
            ob = o;
            vals = nums;
        }
    }

    public static void main(String[] args) {
        Integer n[] = {1, 2, 3, 4, 5};

       // Gen<Integer> gens[] = new Gen<Integer>[10] // Неверно !

        Gen<?>gens[] = new Gen<?>[10]; // Верно
    }
}
