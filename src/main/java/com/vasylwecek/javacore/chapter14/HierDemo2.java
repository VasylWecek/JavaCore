package chapter14;

public class HierDemo2 {
static class NonGen{
    int num;
    NonGen(int i) {
        num = i;
    }

    int getnum(){
        return num;
    }
}

// Обобщенный подкласс
    static class Gen<T> extends NonGen{
    T ob;

    Gen(T o, int i){
        super(i);
        ob = o;
    }

    T getob(){
        return ob;
    }
}

    public static void main(String[] args) {
    // создать объект типа Gen для символьных строк
        Gen<String> w = new Gen<String>("Дoбpo пожаловать ", 47);

        System.out.print(w.getob() + "");
        System.out.println(w.getnum());










    }
}
