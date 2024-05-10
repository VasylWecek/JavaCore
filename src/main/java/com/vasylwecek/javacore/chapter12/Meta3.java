package chapter12;
import java.lang.annotation.*;
import java.lang.reflect.*;



public class Meta3 {
    @Retention (RetentionPolicy.RUNTIME)
    @interface MyAnno{
        String str() default "Тестирование";
        int val() default 9000;
    }

    @MyAnno()
    public static void myMeth(){
        Meta3 ob = new Meta3();

        //получить аннотацию для данного метода
        //и вывести значения ее членов
        try{
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth");

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc){
            System.out.println("Meтoд не найден");
        }
    }

    public static void main(String[] args) {
myMeth();

    }


}
