package day35_methods;


import my_utilities_libary.ArrayUtil;


public class UsingArrayUtil {

    public static void main(String[] args) {

        int [] a = { 3, 1, 6, 12 , 7, 1, 20};
        System.out.println(ArrayUtil.maxNumber(a));
        System.out.println(ArrayUtil.minNumber(a));


        System.out.println(ArrayUtil.contains(a, 12));




    }




}
