package chapter12;
import java.lang.annotation.*;
import java.lang.reflect.*;

// Это контейнерная аннотация, предназначенная для хранения массива других аннотаций типа MyAnno.
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    RepeatAnno.MyAnno[] value();
}

class RepeatAnno {
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(MyRepeatedAnnos.class)
    @interface MyAnno {
        String str() default "Тестирование";
        int val() default 9000;
    }

    // Повторить аннотацию MyAnno в методе myMeth()
    @MyAnno(str = "Первая аннотация", val = -1)
    @MyAnno(str = "Вторая аннотация", val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth("тест", 10);
    }
}
