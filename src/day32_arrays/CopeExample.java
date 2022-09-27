package day32_arrays;

import java.util.Arrays;

public class CopeExample {
    public static void main(String[] args) {

        int [] a = {1, 2, 3};
        int [] b = a; // b is a new reference/name but the array is the same as the one "a" reference/name is pointing to,so there is only one array made
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));


        a [0] = 100;
        b [1] = 200;
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));


        System.out.println();

        int [] z = Arrays.copyOf(a, a.length); // make new object
        System.out.println(Arrays.toString(z)); // copy from a/b
        z [0] = 500; // change only z value
        System.out.println(Arrays.toString(z));
        System.out.println(Arrays.toString(a));















    }
}
