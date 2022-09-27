package homework.tutor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class a12 {

    public static void na () {
        System.out.println("Static method");
    }

    static {
        System.out.println("Static block");
    }



    public static void main(String[] args) {
        int x = 5;
        na();
        String y = new String(); // making object and placing to "y"

        int a[]  = new int[5];
        a[0] = 1;
        a[1] = 2;

        String b[] = new String[10];

        int z[] = {3, 6, 2, 68, 32,-2, 24};
        Arrays.sort(z);

        String c= Arrays.toString(z);
        System.out.println(c);

        ArrayList<Integer> num = new ArrayList<>();
        num.add(3);
        num.add(6);
        num.add(2);
        num.add(68);
        num.add(32);
        num.add(-2);
        num.add(24);
        Collections.sort(num);
        System.out.println(num.toString());

        String st = "A1#H5B7@L0C9M!1D5E2F";
        char charac[] = st.toCharArray();
        Arrays.sort(charac);
        // first way !#01125579@ABCDEFHLM
        String k = String.copyValueOf(charac);
        System.out.println(k);

        // second way [!, #, 0, 1, 1, 2, 5, 5, 7, 9, @, A, B, C, D, E, F, H, L, M]
        String k1 = Arrays.toString(charac);
        System.out.println(k1);


        int j = Integer.valueOf('a'); // ascii
        System.out.println(j);

        int j2 = 'A';
        System.out.println(j2);

        //ABC
        String j3 = "ABC";
        for (int i = 0; i < j3.length(); i++){
            char ch = j3.charAt(i);
            int convert = ch;
            System.out.print(convert + " ");
        }
        char j4 = 107;
        System.out.println(j4);

    }













}
