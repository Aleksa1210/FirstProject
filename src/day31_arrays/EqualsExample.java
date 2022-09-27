package day31_arrays;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {


        int [] a = {1, 2, 3};
        int [] b = {1, 2, 3};
        int [] c = a;

        //System.out.println(a == b); // wrong for Array // compares the array a aray with the b array, they are different object -- not the same
        System.out.println(Arrays.equals(a,b));
        System.out.println(a == c); // compares the array a aray with the c array, they are both refrence to the same array object
        // System.out.println(a.equals(b)); // wrong, not String method. This method is not Array.equals()


        boolean same = Arrays.equals(a,b);


        int [] d ={3, 2, 1};
        System.out.println(Arrays.equals(a,d));






    }
}
