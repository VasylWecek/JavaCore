package chapter08;

class A4 {
    void callme() {
        System.out.println("В методе callme() из класса A");
    }
}

class B4 extends A4 {

    void callme() {
        System.out.println("В методе callme() из класса B");
    }
}

class C4 extends A4 {

    void callme() {
        System.out.println("В методе callme() из класса C");
    }
}

class Dispatch {
    public static void main(String args[]) {
        A4 a4 = new A4();
        B4 b4 = new B4();
        C4 c4 = new C4();

        A4 r;

        r = a4;
        r.callme();

        r = b4;
        r.callme();

        r = c4;
        r.callme();
    }
}
