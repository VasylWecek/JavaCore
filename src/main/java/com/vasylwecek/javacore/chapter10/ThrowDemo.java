package chapter10;
/*
throw генерируемый_экземпляр
генерируемый_экземпляр должен быть обьектом класса
типы вроде int или char a также классы String или  Object, нельзя использовать для генерирования исключений.

Получить обьект класса Throwable можно двумя способами, указав соотвествующий параметр в операторе catch или создав этот обьект с помощью оператора new/

 */
public class ThrowDemo {
    static void demoproc(){ //попытка сгенерировать исключение типа NullPointerException
        try {
            throw new NullPointerException("демонстрация");
        } catch (NullPointerException e) {
            System.out.println(
                    "Исключение перехвачено в теле метода demoproc()."
            );
        }
    }

    public static void main(String[] args) {
        try{
            demoproc();

        } catch (NullPointerException e){
            System.out.println("Повторный перехват: " + e);
        }
    }
}
