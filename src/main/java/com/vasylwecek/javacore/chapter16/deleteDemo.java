package chapter16;

public class deleteDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is a simple test.");

        sb.delete(5, 16);
        System.out.println("Пocлe вызова delete ( ) : " + sb);

        sb.deleteCharAt(0);
        System.out.println("Пocлe вызова deleteCharAt(): " + sb);
    }
}
