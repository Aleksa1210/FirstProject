package homework.tutor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class a1 {
    public static void main(String[] args) {


        String st = "abcabc";
        String temp = "";
        for (int i = 0; i < st.length(); i++){
            String str = String.valueOf(st.charAt(i));
            if (!temp.contains(str)){
                temp += str;
            }


        }
        System.out.println(temp);


        String sor = "A1#H5B7@L0C9M!1D5E2F";
        char [] let = sor.toCharArray();
        Arrays.sort(let);
        System.out.println(let);


        String reve = "cat";
        String empty = "";
        for (int i = 0; i < reve.length(); i++){
            String a = String.valueOf(reve.charAt(i));
            empty = a + empty;
            System.out.println(empty);








            ArrayList<Integer> num = new ArrayList<>(Arrays.asList(2,4,8,2,9,45,-2));
            Collections.sort(num);
            System.out.println(num);







        }








    }






}
