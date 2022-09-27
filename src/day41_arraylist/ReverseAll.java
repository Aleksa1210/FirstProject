package day41_arraylist;

import day40_arraylist.ArrayListWithMethods;
import my_utilities_libary.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {

    public static ArrayList<String> revrseAll (ArrayList<String> list){
        /*
        Reverse All
        Create a method that will take an ArrayList of Strings and reverse each element and return an ArrayList of all reversed words
        Ex: Input: {"ted", "talk", "learn"}
        Output: {"det", "klat", "nrael"}
         */

        ArrayList<String> reversWord = new ArrayList<>();

        for (String each : list){

            reversWord.add(StringUtil.reverse(each)); // we call the reverse method in StringUtil class to reverse each word, each element, the we are adding the reversed worf into the reverseWord ArrayList
            /*
            String reversed = "";
        for (int i = str.length() -1; i >= 0; i--){
            reversed += str.charAt(i);
             */
        }

        return reversWord;


    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(revrseAll(list));


        System.out.println(revrseAll(ArrayListWithMethods.getDaysOfWeek()));// return from another class day 40
    }
}
