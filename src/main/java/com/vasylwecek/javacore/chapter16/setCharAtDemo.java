package chapter16;

public class setCharAtDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Salto");
        System.out.println("бyфep до = " + sb);
        System.out.println("дo вызова charAt(1) = " + sb.charAt(1));

        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("бyфep после =  " + sb);
        System.out.println("пocлe вызова charAt(1) = " + sb.charAt(1));
    }
}
