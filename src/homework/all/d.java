package homework.all;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class d {
    public static void main(String[] args) {
        String str = "";
        ArrayList<String> name = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));

        for (String each : name){
            str = "";


            for  (int i = each.length() - 1; i >= 0 ; i--) {
                str += each.charAt(i);
                System.out.println(Arrays.asList(str + " "));


            }
            Collections.reverse(Arrays.asList(str));

        }


        System.out.print(str);














    }
}
