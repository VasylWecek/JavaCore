package chapter16;

public class StringJoinDemo {
    public static void main(String[] args) {
        String result = String.join(" ", "Alpha", "Beta", "Gamma");
        System.out.println(result);

        result = String.join(", ", "John", "ID#: 569",
                "E-mail: john@HerbSchild.com");
        System.out.println(result);
    }
}
