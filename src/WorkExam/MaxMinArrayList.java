package WorkExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMinArrayList {
    public static void main(String[] args) {



        Integer [] num = {1,23,45,68,2,6,35,26};
        ArrayList<Integer> max = new ArrayList<>(Arrays.asList(num));

        System.out.println(Collections.max(max));
        System.out.println(Collections.min(max));




    }
}
