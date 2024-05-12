package chapter13;

public class NativeDemo {
    int i;
    public static void main(String[] args) {
        NativeDemo ob = new NativeDemo();

        ob.i = 10;

        System.out.println("Coдepжимoe переменной ob.i перед вызовом\n" +
                "платформенно-ориентированного метода: " + ob.i);
        ob.test(); // вызвать платформенно-ориентированный метод;

        System.out.println("Coдepжимoe переменной ob.i после вызова\n" +
                "платформенно-ориентированного метода: " + ob.i);
    }

    //объявить платформенно-ориентированный метод
    public native void test();

    // загрузить библиотеку DLL, содержащую статический метод
    //выполняется только один раз при запуске программы, а точнее говоря, при первой загрузке ее класса
    static {
        System.loadLibrary("NativeDemo");
    }
}
