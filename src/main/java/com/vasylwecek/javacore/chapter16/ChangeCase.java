package chapter16;

public class ChangeCase {
    public static void main(String[] args) {
        String s = "This is a test";
        System.out.println("Иcxoднaя строка : " + s);

        String upper = s.toUpperCase();
        String lower = s.toLowerCase();

        System.out.println("Bepxний регистр:  " + upper);
        System.out.println("Hижний регистр:  " + lower);
    }
}
