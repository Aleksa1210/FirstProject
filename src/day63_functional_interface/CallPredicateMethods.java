package day63_functional_interface;

public class CallPredicateMethods {
    public static void main(String[] args) {

        boolean b = UsePredicates.isPalindrome.test("racecar");
        System.out.println(b);

        System.out.println(UsePredicates.isPalindrome.test("abc"));

        System.out.println(UsePredicates.isPrime.test(5));


    }
}
