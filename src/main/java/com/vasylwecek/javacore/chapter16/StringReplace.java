package chapter16;

public class StringReplace {
    public static void main(String[] args) {
        String org = "This is a test. This is, too.";

        String search = "is";
        String sub = "was";
        String result = "";

        int i;
        do {
            System.out.println(org);
            i = org.indexOf(search);
            if (i != -1) {
                result = org.substring(0, i) + sub + org.substring(i + search.length());
                org = result;
            }
        } while (i != -1);

        System.out.println(result);  // Вывод итогового результата после всех замен
    }
}
