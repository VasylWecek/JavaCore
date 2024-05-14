package chapter14;

public class OverrideDemo {
    static class Gen<T> {
        T ob; // обьявить обьект типа T

        // передать конструктору ссЬ1Лку на объект типа Т
        Gen(T o) {
            ob = o;
        }

        T getob(){
            System.out.print("Method getob() from class Gen: ");
            return ob;
        }
    }

    static class Gen2<T> extends Gen <T> {
        Gen2(T o){
            super (o);
        }

        T getob(){
            System.out.print("Method getob() ftom class Gen2: ");
            return ob;
        }
    }

    public static void main(String[] args) {
        // make object type Gen for itegers
        Gen<Integer> iOb = new Gen<Integer>(88);

        //make object type Gen2 for integers
        Gen<Integer> iOb2 = new Gen2<Integer>(99);

        // make object type Gen2 for charter strings
        Gen2<String> strOb2 = new Gen2<String> ("Test generalizations");
        System.out.println(iOb.getob());
        System.out.println(iOb2.getob());
        System.out.println(strOb2.getob());
    }
}
