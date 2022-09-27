package day30_arrays;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {


        String s = "monday,tuesday,wednesday,thursday,friday,saturday,sunday";

        String [] days = s.split(",");
        System.out.println(Arrays.toString(days));

        for (String day : days){
            System.out.println(day);
        }


        System.out.println();


        String [] withOutDay = s.split("day");
        //System.out.println(Arrays.toString(withOutDay));

        for (String each : withOutDay){
            System.out.println(each);
        }


        String str = "Jan-Feb-Mar-Apr-May-Jun-Jul-Aug-Sep-Oct-Nov-Dec";
        String [] months = str.split("-");
        System.out.println(Arrays.toString(months));

        for (String each : months){
            System.out.println(each);
        }










    }
}
