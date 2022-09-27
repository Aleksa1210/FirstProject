package day27_loops;

public class hm03_08_0 {
    public static void main(String[] args) {




            int repeat = 8;
            String num = "*";
            for (int i = 0; i <= repeat; i++) {// iterating from 0-8
                // and in each iteration j will iterate as long as less than or equal to i
                for (int j = 0; j <= i ; j++) {
                    System.out.print(num + " ");
                }

                System.out.println();
            }









    }
}
