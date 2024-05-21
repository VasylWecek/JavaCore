package chapter18;
import java.util.EnumSet;

public class EnumSetDemo {
    enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // Создание множества, содержащего все дни недели
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println("All days: " + allDays);

        // Создание пустого множества
        EnumSet<Day> noDays = EnumSet.noneOf(Day.class);
        System.out.println("No days: " + noDays);

        // Создание множества с конкретными днями
        EnumSet<Day> weekend = EnumSet.range(Day.SATURDAY, Day.SUNDAY);
        System.out.println("Weekend: " + weekend);

        // Создание множества с диапазоном дней
        EnumSet<Day> workDays = EnumSet.range(Day.MONDAY, Day.FRIDAY);
        System.out.println("Work days: " + workDays);

        // Создание множества на основе другого множества
        EnumSet<Day> copyOfWorkDays = EnumSet.copyOf(workDays);
        System.out.println("Copy of work days: " + copyOfWorkDays);

        // Создание множества, дополняющего другое множество
        EnumSet<Day> complementOfWorkDays = EnumSet.complementOf(workDays);
        System.out.println("Complement of work days: " + complementOfWorkDays);
    }
}
