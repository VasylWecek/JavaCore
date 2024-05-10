package chapter12;
import java.lang.annotation.*;
import java.lang.reflect.*;

public class Single {
    @Retention (RetentionPolicy.RUNTIME)
    @interface MySingle{
// // Только одно значение, цена товара
        int value(); // эта переменная должна иметь имя value
    }

    @MySingle (100) // Автоматически понимается, что это цена
    public static void myMeth(){
        Single ob = new Single();

        try { // блок
            Method m = ob.getClass().getMethod("myMeth");// найходим метод по имени myMeth

            MySingle anno = m.getAnnotation(MySingle.class); // Извлечение аннотации

            System.out.println(anno.value());
        } catch (NoSuchMethodException exc){
            System.out.println("Meтoд не найден .");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
