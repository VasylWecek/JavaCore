package chapter07;// Возврат объекта

/**
 * Этот код определяет класс Test с одним полем a и методом incrByTen,
 * который создаёт новый объект Test, увеличивает значение a на 10 и
 * возвращает этот новый объект. В классе RetOb, метод main создаёт
 * объект ob1 класса Test, затем вызывает метод incrByTen, чтобы
 * получить новый объект ob2, который является версией ob1 с
 * увеличенным значением a. Значения поля a обоих объектов
 * выводятся в консоль. Затем ob2 обновляется, вызывая
 * incrByTen ещё раз, и новое значение a для ob2 также выводится.
 */
class Test2 {
    int a;

    Test2(int i) {
        a = i;
    }

    Test2 incrByTen() {
        Test2 temp = new Test2(a + 10);
        return temp;
    }
}

class RetOb {
    public static void main(String args[]) {
        Test2 ob1 = new Test2(2);
        Test2 ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a после второго увеличения значения: " + ob2.a);
    }
}
