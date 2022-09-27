package day30_arrays;

import java.util.Scanner;

public class ReverseMiddleWord {
    public static void main(String[] args) {


        String str = "I want sleep";
        String [] split = str.split(" ");
        String reversed = "";

        char [] middleWord = split[1].toCharArray();

        for (int i = middleWord.length - 1; i >= 0; i--){
            reversed += middleWord[i];
        }
        System.out.println(reversed.trim());
        System.out.println(split[0] + " " + reversed + " " + split[2]);











    }
}
