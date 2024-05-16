package chapter16;

public class MakeString {
    public static void main(String[] args) {
        char c[] = {'J', 'a', 'v', 'a'};
        String s1 = new String(c);
        String s2 = new String(s1);
        System.out.println(c);
        System.out.println(s1);

    }
}
