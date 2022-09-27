package homework.all;

import java.util.ArrayList;
import java.util.SortedMap;

public class b {
    public static void main(String[] args) {

        String str = "JAVA java";
       int upper = 0;
       int lower = 0;
       boolean equal = false;

       for (int i = 0; i < str.length(); i++) {
           char letter = str.charAt(i);


           if (Character.isUpperCase(letter)) {
               upper++;
           } else if (Character.isLowerCase(letter)) {
               lower++;
           }
       }

               if (upper == lower) {
                   equal = true;
                   System.out.println(equal);
           } else {
                   equal = false;
                   System.out.println("False");
               }

























    }
}
