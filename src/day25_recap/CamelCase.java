package day25_recap;

import java.util.Locale;
import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {

        /* Camel Case
        Given a String with multiple words separated by spaces, create a camel
        case version of the words. Every word, except the first word, begin with
        an uppercase letter. The other characters of the word will be lowercase
        Ex:
        Today is SUNDAY
        Output:
        todayIsSunday */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter words");
        String str = input.nextLine().toLowerCase(Locale.ROOT);
        String camelCase = str.substring(0,1); // i am put the first charachter into String rihgt away, because my loop will start from i = 1. It starts from i = 1; to check for space and i don't want to do this in the first iteration   ( t )


        for (int i = 1; i < str.length(); i++){

            if (str.charAt(i - 1) == ' '){ // if there space
                camelCase += str.substring(i, i + 1).toUpperCase(Locale.ROOT); // ("" + str.chartAt(i)).toUpperCase()
            // sub ( i, i + 1) is the same as charAt but the types are different
            }else {
                camelCase += str.charAt(i); // today
            }





        }
        System.out.println(camelCase.replace(" ",""));

















    }
}
