package homework.all;

import java.util.ArrayList;
import java.util.Arrays;

public class c1 {
    public static void main(String[] args) {

        ArrayList<String> target = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));


        int repeat = 0;


        for (int i = 0; i < target.size(); i++) {

           System.out.println(target.get(i));
        if (target.get(i).contains("java")){
            repeat++;
        } else {

        }

        }

        System.out.println(repeat);






    }

}
