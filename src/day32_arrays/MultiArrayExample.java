package day32_arrays;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {


        int [] n = {5, 10, 20, 10};
        int [] m = {5, 10, 100, 39, 19};

        int [][] all = {n, m };
        System.out.println(all);
        System.out.println(Arrays.toString(all));
        System.out.println(Arrays.deepToString(all));
        System.out.println("First array " + Arrays.toString(all[0]));
        System.out.println("Second array " + Arrays.toString(all[1]));

        System.out.println();

        int [] [] multi = {
                {90, 80, 70}, // INDEX 0 ARRAY
                {19, 51, 1129, 12}, // INDEX 1 ARRAY
                {10,1990}, // INDEX 2 ARRAY
                {14} //INDEX 3 ARRAY

        };

        System.out.println(multi.length); // all array 4
        System.out.println(multi[0].length);
        System.out.println(multi[0][1]); // in 0 array show 1 = 80
        System.out.println(multi[3].length);








    }
}
