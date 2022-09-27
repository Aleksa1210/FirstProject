package day37_wrapper_arraylist;

import java.util.Arrays;
import java.util.Locale;

public class CountCharacters {
    public static void main(String[] args) {

        String str = "aP3d572&*jd@jdJU";

        int upper = 0, lower = 0, number = 0,other = 0;
        String uppercaseChars = ""; // for show exactly letter

       for (int i = 0; i < str.length(); i++){
           char letter = str.charAt(i);

           if (Character.isUpperCase(letter)){
               upper++;
               uppercaseChars += letter; // for show exactly letter
           } else if (Character.isLowerCase(letter)){
               lower++;
           }else if (Character.isDigit(letter)){
               number++;
           }else {
               other++;
           }



       }

        System.out.println("uppercase " + upper + " " + Arrays.toString(uppercaseChars.toCharArray()));
        System.out.println("lowercase " + lower);
        System.out.println("Numbers " + number);
        System.out.println("Other " + other);
    }
}
