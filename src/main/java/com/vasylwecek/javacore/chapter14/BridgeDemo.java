package chapter14;

public class BridgeDemo {

    static class Gen<T>{
        T ob; //declare an object of type T

        // передать конструктору ссыпку на объект типа Т
        Gen (T o){
            ob = o;

        }

        // возвратить объект оЬ
        T getob(){
            return ob;
        }
    }

    static class Gen2 extends Gen<String> {
        Gen2 (String o){
            super(o);
        }

        String getob(){
            System.out.println("Bызaaн метод String getob() : ");
            return ob;
        }
    }

    public static void main(String[] args) {
        Gen2 strOb2 = new Gen2("Generalization test");

        System.out.println(strOb2.getob());
    }
}
