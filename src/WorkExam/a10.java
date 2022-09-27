package WorkExam;

import java.util.ArrayList;
import java.util.Arrays;

public class a10 {
    public static void main(String[] args) {
      // summ 1+2+3+4 =10
       String one = "1 2 3 4";
        String [] str = one.split(" "); // 1  2  3 4
        System.out.println(Arrays.toString(str));
        int sum = 0;
        for (int i = 0; i < str.length; i++){

            sum += Integer.parseInt(str[i]);

        }
        System.out.println(sum);





    }
}
