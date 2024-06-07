package chapter20;
//import java.io.*;
//
//import static java.lang.System.in;
//
//public class ByteArrayInputStreamReset {
//    public static void main(String[] args) {
//        String tmp = "abc";
//        byte b[] = tmp.getBytes();
//
//        ByteArrayInputStream bais = new ByteArrayInputStream(b);
//
//        for ( int i =0; i<b.length; i++){
//            int c;
//            while ((c = bais.read()) != -1){
//                if (i == 0){
//                    System.out.println((char) c);
//                }else {
//                    System.out.println(Character.toUpperCase((char)c));
//
//                }
//            }
//            System.out.println();
//            in.reset();
//        }
//    }
//}

import java.io.*;

public class ByteArrayInputStreamReset {
    public static void main(String[] args) {
        String tmp = "abc";
        byte b[] = tmp.getBytes();

        ByteArrayInputStream bais = new ByteArrayInputStream(b);

        int c;
        while ((c = bais.read()) != -1) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Print as lowercase if index is even, otherwise uppercase
                if (bais.available() % 2 == 0) {
                    System.out.print((char) Character.toLowerCase(c));
                } else {
                    System.out.print((char) Character.toUpperCase(c));
                }
            } else {
                // Print non-letter characters as they are
                System.out.print((char) c);
            }
        }
        System.out.println();
    }
}