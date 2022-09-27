package homework.all;

import java.util.Arrays;

public class hm03_15_Reverse {
    public static void main(String[] args) {


        String sent = "It started to snow in Chicago";
        String [] split =  sent.split(" ");
        System.out.println(Arrays.toString(split));

        String reverse = "";




        for (int i = split.length - 1; i >= 0; i--){
            reverse += split[i] + " ";
        }
        System.out.println(reverse.trim());



        for (int i = 0; i > 5; i++){
            reverse += split[i] + " ";
        }
        System.out.println(reverse.trim());








    }
}
