package day07_unary_operators;

public class IncrementExample3 {


    public static void main(String[] args) {


        int i = 5; // 6
        int z = i++;  // 5


        System.out.println(i);
        System.out.println(z);


        int a = 10;
        int b = a;

        System.out.println(a);
        System.out.println(b);

        int a1 = 10;
        int b1 = a + 1;

        System.out.println(a1);
        System.out.println(b1);

        int c = ++a1; // a - 10 -> 10 + 1 =11

        System.out.println(c);
        System.out.println(a1);



    }


}
