package WorkExam;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {


   String name = "AAABBBCCC";

    String uniq = "";
    for (int i = 0; i < name.length(); i++){
        Character letter = name.charAt(i);


        if (!uniq.contains("" + letter)){
            uniq += letter;


        }
    }

        System.out.println(uniq);











    }
}
