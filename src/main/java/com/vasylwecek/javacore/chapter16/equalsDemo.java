package chapter16;

public class equalsDemo {
    public static void main(String[] args) {
        String s1 = "Привет";
        String s2 = "Привет";
        String s3 = "Прощай";
        String s4 = "ПРИВЕТ";

        System.out.println(s1 + " = " + s2 + " -> " + s1.equals(s2));

        System.out.println(s1 + " = " + s3 + " -> " + s1.equals(s3));

        System.out.println(s1 + " = " + s4 + " -> " + s1.equals(s4));

        System.out.println(s1 + " равно беэ учета регистра " + s4 + " -> " + s1.equalsIgnoreCase(s4));
    }
}
