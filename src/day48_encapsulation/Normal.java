package day48_encapsulation;

import day43_custom_classes.Market;
import my_utilities_libary.StringUtil;

import java.util.Arrays;

public class Normal {
    public static void main(String[] args) {


        int [] a = {4, 12, 5, 25};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println(Math.PI); // this variable is static - in the lank package

        System.out.println(StringUtil.reverse("java"));



    }
}
