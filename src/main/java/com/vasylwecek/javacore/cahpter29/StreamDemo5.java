package cahpter29;

import java.util.ArrayList;
import java.util.stream.Stream;

class NamePhoneEmail {
    String name;
    String phonenum;
    String email;

     NamePhoneEmail (String n, String p, String e){
        name = n;
        phonenum = p;
        email = e;
    }
}

class NamePhone {
     String name;
     String phonenum;

     NamePhone (String n, String p){
         name = n;
         phonenum = p;
     }
}

class StreamDemo5 {
    public static void main(String[] args) {

        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("John Doe", "6666-6666", "john@doe.com"));

        myList.add(new NamePhoneEmail("Djike", "7373839-3093837", "djike@doe.com"));


        System.out.println("Иcxoдныe элементы из списка myList: ");
        myList.stream().forEach((a) -> System.out.println(a.name + " " + a.phonenum + " " + a.email));
        System.out.println();


        Stream<NamePhone> nameAndPhone = myList.stream().map(
                (a) -> new NamePhone(a.name, a.phonenum)
        );

        System.out.println("Cпиcoк имен и номеров телефонов: ");
        nameAndPhone.forEach((a) -> {
            System.out.println(a.name + " " + a.phonenum);

        });
    }
}
