package day64_functional_interface;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {


        BiPredicate<Integer[], Integer> contains = (arr, num) -> { // BiPredicate accept 2 arguments
            for (int each : arr){
                if (each == num){ // if this statement is every true then my array does contain we were looking for, so we return true
                    return true;
                }
            }
            return false; // if the loop finishes and compare the num with every number in the array, the array does not contain the num, returning false
        } ;

        Integer [] arrs ={ 4,5 ,7, 8,};
        System.out.println(contains.test(arrs, 12)); // false   // it is int, but when i run complair automat change on Integer
        System.out.println(contains.test(arrs, 5)); // does my array have 5 - true
        System.out.println(contains.test(arrs, 0)); // false



        BiPredicate <String, String> anagram = (one, two) -> {
            char [] oneArr = one.toCharArray();
            char [] twoArr = two.toCharArray();
            Arrays.sort(oneArr);
            Arrays.sort(twoArr);

            return Arrays.equals(oneArr, twoArr);
        };

        System.out.println(anagram.test("listen", "silent"));



    }
}
