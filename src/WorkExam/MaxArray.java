package WorkExam;

import java.util.Arrays;

public class MaxArray {
    public static void main(String[] args) {


        int [] num = { 1,5,2,20,56,32,12};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println(num[num.length-1]);

    }



}
