package day08_relational_operators;

public class HomeWork11 {
    public static void main(String[] args) {

        int x = 2 + 3 * 2 / 1; // 8
        System.out.println(x);


        int y = ( 2 + 3 ) * 2; // 10
        System.out.println(y);

        int w = 78 / 2 * 2 + 3 - 5 % 5;  // 81
                // 39 * 2 + 3 - 5 % 5
                // 78 + 3 - 5 % 5
                // 78 + 3 - 0
                // 81
        System.out.println(w);

        int i = 8 + 2 + 3 + 5 - 2 - 1- 0 + 1 * 2; //17
        System.out.println(i);


        int a = 8; // 8 --> 7
        int b = a--; // b= 8

        System.out.println(a); // 7
        System.out.println(b); // 8


        int e = 1; // e = 1 -> 0 -> 1 -> 0 -> -1
        int f = -e-- + e++ / -e-- * --e; // ?????
                // -1 + 0 / - 1 + -1
                // -1 + 0 / -1 * -1
                // -1 + 0  * -1
               // -1 + 0
               // -1

        System.out.println(e); // -1
        System.out.println(f); //-1



        int L = 50; // L = 50 -> 49 -> 50 -> 49 -> 50
        int P = --L + L++ + L-- + L++;
              // 49 + 49 + 50 + 49
               // 49 + 51 + 49 + 51

        System.out.println(L); //50
        System.out.println("P is " + P); // 197
        System.out.println();


        int X = 4;
        int Y = X * 4 - X++;
            //  4 * 4 - 4
        System.out.println("x" + X); // 5
        System.out.println("y" + Y); //


        System.out.println();
        int t = 100;
        int p = - ++t * -t-- / t++ + --t;
              // -101 * -101 / 100 + 100
              // - 10.201 / 100 + 100
              //   - 102.01 + 100
              // 202

        System.out.println(t); //100
        System.out.println(p); // 0 ???

        int R = 20;  // R 20 -> 19 -> 20 -> 19 -> 18
        int W = -R-- + -R++ + --R * R-- % 2;
           //  -20  + - 19 + 19 * 19 % 2
           //  -20  + - 19 + 361 % 2
           //  -20  + - 19 + 1
           //  - 39 + 1
           //   - 38

        // 361 % 2 how many rimes does 2 go into 360 evenly
        // 2 into 360, 180 -> 360
        // 361 - 36- -> 1


        System.out.println(R); //18
        System.out.println(W);  // - 38



        int M = 300;  // 301 -> 300
        int N = 400; // 401
        int U = ++M + N++ - M-- % 2 + --N % 2;
              // 301 + 400 - 301 % 2 + 400 % 2;
              // 301 + 400 - 1 + 0;
              // 700



        System.out.println(M); // 300
        System.out.println(N); // 400
        System.out.println(U); // 700





    }

}
