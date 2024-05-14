package chapter14;

// Класс NonGen - функциональный эквивалент класса Gen без обобщений
class NonGen{
    Object ob; // объект ob теперь имеет тип Object

    // передать конструктору ссылку на объект типа OЬject
    NonGen(Object o){
        o = ob;
    }

    // возвратить тип Object{
    Object getOb(){
        return ob;
    }

    // показать тип объекта оЬ
    void showType(){
        System.out.println("Oбъeкт ob относится к типу " + ob.getClass().getName());
    }
}

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;

        // создать объект типа NonGen и сохранить в нем
        // объект типа Integer. Выполняется автоупаковка

        iOb = new NonGen(88);

        //показать тип данных , хранящихся в переменной iОЬ
        iOb.showType();

        // получить значение переменной iOb,
        // на этот раз требуется приведение типов
        int v = (Integer) iOb.getOb();
        System.out.println("Знaчeниe: " + v);
        System.out.println();

        // создать другой объект типа NonGen и
        // сохранить в нем объект типа String
        NonGen strOb = new NonGen("Tecт без обобщений");

        // показать тип данных, хранящихся в переменной strOb
        strOb.showType();

        // получить значение переменной strOb,
        // И в этом случае потребуется приведение типов
        String str = (String) strOb.getOb();
        System.out.println("Знaчeниe: " + str);

        iOb = strOb;
        v = (Integer) iOb.getOb();
    }

}
