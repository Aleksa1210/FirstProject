package WorkExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseFirstTwoWords {
    public static void main(String[] args) {
        String str = "Cat in the hat";
        String str2 = "";
        //swap 1 and2      3 and 4
        String[] temp = str.split( " " );
        System.out.println( Arrays.toString( temp ) );
        ArrayList<String> list = new ArrayList<>(Arrays.asList( temp ));
        for (int i = 0; i <list.size() ; i+=2) {
            Collections.swap(list,i,(i+1));
        }
        System.out.println(list);

    }
}
