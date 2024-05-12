package chapter13;

public class InstanceOf {
    static class A{
        int i, j;
    }

    static class B{
        int i, j;

    }
    static class C extends A{
        int k;

    }
    static class D extends A{
        int k;
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A)
            System.out.println("a является экземпляром А");
        if (b instanceof B)
            System.out.println("b является экземпляром B");
        if (c instanceof C)
            System.out.println("c является экземпляром C");
        if (c instanceof A)
            System.out.println("c можно привести к типу A");

        if (a instanceof C)
            System.out.println("a можно привести к типу C"); // false, так как a не является экземпляром C или его подклассом.

        System.out.println();

        // сравнить с порожденными типами
        A ob; //  используется для демонстрации полиморфизма.

        ob = d; // ссылка на объект d, демонстрирует, что объекты подклассов могут быть ссылками типа их суперкласса.

        System.out.println("ob теперь ссылается на d");
        if (ob instanceof D)
            System.out.println("ob является экземпляром D");

        System.out.println();

        ob = c; // демонстрирует, что объекты подклассов могут быть ссылками типа их суперкласса.
        System.out.println("ob является экземпляром c");

        if (ob instanceof D)
            System.out.println("ob можно привести к типу D");
        else
            System.out.println("ob нельзя приеести к типу D");

        if (ob instanceof A)
            System.out.println("ob можно привести к типу А");

        System.out.println();

        //все объекты могут быть приведены к типу Object
        if (a instanceof Object)
            System.out.println("a можно привести к типу Object");
        if (b instanceof Object)
            System.out.println("b можно привести к типу Object");
        if (c instanceof Object)
            System.out.println("c можно привести к типу Object");
        if(d instanceof Object)
            System.out.println("d можно привести к типу Object");

    }
}
