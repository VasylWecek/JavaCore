package chapter12;
import java.lang.annotation.*;
import java.lang.reflect.*;

// Аннотация-маркер - это аннотация, которая не содержит никаких параметров и служит только для пометки метода, класса или поля.
public class Marker {
    @Retention (RetentionPolicy.RUNTIME)// помечаем, чтобы аннотация была доступна во время выполнения программы.
    @interface MyMarker{}

    @MyMarker
    public static void myMeth(){
        /*
        Метод myMeth помечен аннотацией MyMarker,
        что делает его особенным для программы,
        чтобы можно было определять его при помощи рефлексии.
         */
        Marker ob = new Marker();

        try {
            Method m = ob.getClass().getMethod("myMeth");


            // Проверяем наличие аннотации MyMarker с помощью метода isAnnotationPresent().
            if (m.isAnnotationPresent(MyMarker.class))
                System.out.println("Aннoтaция-мapкep MyMarker присутствует.");
        } catch (NoSuchMethodException exc){
            System.out.println("Meтoд не найден . ");

        }
    }

    public static void main(String[] args) {
        myMeth();
    }

}
