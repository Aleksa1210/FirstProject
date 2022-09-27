package homework.all;

public class hm2 {
    public static void main(String[] args) {

        //Give a number determine if it is a prime number. A prime number is a
        //number that is only divisible by 1 and itself.
        //Ex:
        //Input:
        //11
        //Output:
        //prime
        //Ex:
        //Input:
        //10
        //Output:
        //not prime

        int num = 1;

        for (int i = 0; i <= 3; i++){
            num = i;
            System.out.print(" " + i + " ");


            if (num % 2 == 1){
                System.out.print("prime" + " ");
            } else
                System.out.print("not prime" + " ");

        }





















    }
}
