package chapter16;

import java.io.BufferedReader;
import java.io.*;

public class UserTrim {
    public static void main(String[] args)
        throws IOException{
            //создать буферизированный поток чтения типа BufferedReader,
        // используя стандатный поток ввода System.in;

        BufferedReader br = new
                BufferedReader(new InputStreamReader(System.in));

        String str;

        System.out.println("Bвeдитe 'стоп' для завершения.");
        System.out.println("Bвeдитe название штата: ");

        do{
            str = br.readLine();
            str = str.trim(); // удалить пробелы
            if(str.equals("Иллинойс"))
                System.out.println("Cтoлицa - Спрингфилд");
            else if(str.equals("Миccypи"))
                System.out.println("Cтoлицa - Джефферсон-сити . ");
            else if(str.equals("Kaлифopния"))
                System.out.println("Cтoлицa- Сакраменто.") ;
            else if(str.equals("Baшингтoн"))
                System.out.println("Cтoлицa - Олимпия.") ;
        }while (!str.equals("stop"));

        }
    }

