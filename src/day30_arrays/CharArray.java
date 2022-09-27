package day30_arrays;

import java.util.Arrays;
import java.util.Locale;

public class CharArray {
    public static void main(String[] args) {

        char [] letters = { 'j', 'a', 'v', 'a'};


        String word = "java";  // convert a String to a char []

        char [] java = word.toCharArray();
        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(java));

        //System.out.println(letters); // String work with char [] internally so th e char [] is able to be is able to be printed at the String

        for (char eachChar : java){  // for (char eachChar : word.toCharArray()){
            System.out.println(eachChar);
        }

        System.out.println(java[0]);


        // convert a char array to a String

        char [] day = { 'm', 'o', 'n', 'd', 'a', 'y'};
        System.out.println(day.length);

        String convert = new String(day); // convert to monday
        System.out.println(convert);
        System.out.println(convert.toUpperCase(Locale.ROOT));
      //  System.out.println(day.toUpperCase(Locale.ROOT)); cannot use String method on a char []














    }
}
