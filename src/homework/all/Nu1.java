package homework.all;

import java.util.Arrays;

public class Nu1 {
    public static void main(String[] args) {



        int [][] arr1 = {
                {1, 2, 3},
                {2, 5, 10},
                {0, 3, 20},
        };

        int [][] arr2 = {
                {1, 2, 3},
                {2, 5, 10},
                {0, 3, 20},
        };
        int [][] sum = new int[3][3];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++){
                sum [i][j] = arr1[i][j] * arr2[i][j];


            }

            }

        System.out.println(Arrays.deepToString(sum));













    }
}
