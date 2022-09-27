package day21_loops;

public class PrintNumbers {
    public static void main(String[] args) {

        int num = 2;
        num = num % 2;

        while (num <= 100){
            System.out.println("Hello" + num);
            num += 2;
        }

        System.out.println();
        // approach 2

        int n = 1;
        while (n <= 100) {
            if (n % 2 == 0) ;
            {
                System.out.println("Hey" + n);
            }
            n++;
        }

        System.out.println();


        // odd numbers

        int a = 1;
        while (a <= 100){
            System.out.print(a + " ");
            a += 2; // a = a + 2

        }


        System.out.println();
         int b = 0;
         while (b++ <= 100){
             if (b % 2 == 1){
                 System.out.print(b + " ");
             }
         }

         /*
         flow:
         b = 0
         b++ <= 100 --> 0 <= 100 --> loop runs and b is now 1
         if (b % 2 == 1) --> 1 % 2 = 1 --> true --> prints number

         while (b++ <= 100) --> 1 <= 100 --> loop runs and b increments to 2
         if (b % 2 == 1) --> 2 % 2 == 1 --> false -> nothing happens

          while (b++ <= 100) --> 2 <= 100 --> loop runs and b increments to 3


          */









    }
}
