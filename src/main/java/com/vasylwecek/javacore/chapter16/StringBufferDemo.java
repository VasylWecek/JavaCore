package chapter16;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("KitKat");
        System.out.println("бyфep = " + sb);
        System.out.println("длинa = " + sb.length());
        System.out.println("eмкocть = " + sb.capacity());
    }
}
