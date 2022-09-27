package day63_functional_interface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class UsePredicates {

    public static Predicate<String> isPalindrome = str -> {
        String  reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    };


    //is Prime or not
public static Predicate<Integer> isPrime = n -> {
    boolean valid = true;

    if (n == 0 || n == 1) return false;

    for (int i = 2; i < n; i ++){
        if (n % 2 == 0){
            return false;
        }
    }
    return true;
};




//Predicate one parameter and return boolean
}
