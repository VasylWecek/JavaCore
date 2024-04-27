package chapter08;

class A1{
    A1(){
        System.out.println("B конструкторе А. ");
    }
}

class B1 extends A1{
    B1 (){
        System.out.println("B конструкторе B. ");
    }
}

class C1 extends B1 {
    C1 (){
        System.out.println(" B конструкторе C. ");

    }
}
public class CallingCons {
    public static void main(String[] args) {
        C1 c1 = new C1 ();
    }
}
