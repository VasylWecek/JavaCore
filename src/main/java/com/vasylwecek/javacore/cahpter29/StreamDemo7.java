package cahpter29;
import java.util.*;
import java.util.stream.*;



class StreamDemo7 {
    public static void main(String[] args) {
        // Список имен, номеров телефонов и адресов электронной почты
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Ларри", "555-5555", "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Джеймс", "555-4444", "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Мэри", "555-3333", "Mary@HerbSchildt.com"));

        // отобразить только имена и номера телефонов на новый поток данных
        Stream<NamePhone> nameAndPhone = myList.stream().map(
                (a) -> new NamePhone(a.name, a.phonenum)
        );

        // вызвать метод collect(), чтобы составить список типа List
        // из имен и номеров телефонов
        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());
        System.out.println("Имена и номера телефонов в списке типа List:");
        for(NamePhone e : npList)
            System.out.println(e.name + ": " + e.phonenum);

        // получить другое отображение имен и номеров телефонов
        nameAndPhone = myList.stream().map(
                (a) -> new NamePhone(a.name, a.phonenum)
        );

        // а теперь создать множество типа Set, вызвав метод collect()
        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());
        System.out.println("\nИмена и номера телефонов в множестве типа Set:");
        for(NamePhone e : npSet)
            System.out.println(e.name + ": " + e.phonenum);
    }
    static class NamePhoneEmail {
        String name;
        String phonenum;
        String email;

        NamePhoneEmail(String n, String p, String e) {
            name = n;
            phonenum = p;
            email = e;
        }
    }

    static class NamePhone {
        String name;
        String phonenum;

        NamePhone(String n, String p) {
            name = n;
            phonenum = p;
        }
    }
}
