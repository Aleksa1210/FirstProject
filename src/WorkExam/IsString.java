package WorkExam;

import java.util.ArrayList;
import java.util.Arrays;

public class IsString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("hello" , "bye", "How"));
        System.out.println(listOfString(list));
    }

    public static String listOfString (ArrayList<String> list){
        String str = "";

        if (list.size() == 0){
            return "";
        }

        for (String string : list){
            str += string + " ";
        }
        return  str.trim();
    }

// method accepts string list return to list









}
