package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithMethods {
    public static ArrayList<String> getDaysOfWeek(){


        ArrayList<String> days = new ArrayList<>(Arrays.asList(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday" ));
        return days;
    }
        /*
        String  = "abs";
        a.toUpperCase().replace("a", "d").trim();
        a = a.toUpperCase()
        .replace("a", "d")
        .trim();
         */
    public static String printList (ArrayList<String> list){
        String str = "LIST";
        for (String each : list){
            str += "\n~\t" + each;
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(getDaysOfWeek());

        ArrayList<String> days = getDaysOfWeek();
        System.out.println(days.get(0));  //Monday // we have access
        System.out.println(getDaysOfWeek().get(0));  //Monday // we don't have access

        System.out.println(printList(getDaysOfWeek()));


        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three")); // my method
        System.out.println(printList(list));
    }






}
