package homework.all;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class d1 {
    public static void main(String[] args) {

        ArrayList<Integer> duplicat = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));

        duplicat.removeAll(Arrays.asList(1,5));
        System.out.println(duplicat);



        ArrayList<String> removeCountry = new ArrayList<>(Arrays.asList("Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"));

        removeCountry.removeAll(Arrays.asList("United States", "United Kingdom"));
        System.out.println(removeCountry);



        ArrayList<String> maxNumber4 = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven"));

        maxNumber4.removeIf( n -> n.length() > 4);
        System.out.println(maxNumber4);



        String letter = "";
        ArrayList<String> countLetters= new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium", "java"));


        for (String each : countLetters){
           letter = "";
            for  (int i = each.length() - 1; i >= 0 ; i--) {
                letter += each.charAt(i);



            }
        }
        System.out.println(Collections.frequency(countLetters, "java"));









    }
}
