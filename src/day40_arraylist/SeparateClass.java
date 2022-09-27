package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateClass {
    public static void main(String[] args) {


        String s = "ABCD123$%#@&456EFG!";

        ArrayList<String> str = new ArrayList<>(Arrays.asList(s.split("")));
        System.out.println(str);
        ArrayList<String> num = new ArrayList<>(str);

      num.retainAll(Arrays.asList("0","1","2","3","4","5","6","7","8","9"));
        System.out.println(num);


        ArrayList<String> specialChars = new ArrayList<>(str);
        specialChars.retainAll(Arrays.asList("!","@","#","$","%","^", "&","*", "(", ")", "~"));
        System.out.println(specialChars);

        ArrayList<String> letter = new ArrayList<>(str);
        letter.removeAll(num);
        letter.removeAll(specialChars);
        System.out.println(letter);





    }
}
