package homework.tutor;

public class a2 {
    public static void main(String[] args) {


   /* Numbers - FINRA
> Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.*/

   // finra(30);
    divide(15,3);
    divide(12,5);



    }

    public static void finra(int num){
        for (int i = 1; i <= num; i++){

            System.out.println(i);
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i + "FINRA");
            }else if (i % 3 == 0){
                System.out.println(i + "FIN");
            }else if (i % 5 == 0){
                System.out.println(i + "RA");
            }else {
                System.out.println(i);
            }
        }



        // dont do such (wrong)
//        for (int i = 1; i <= num; i++){
//            System.out.println(i);
//            if (i % 3 == 0){
//                System.out.println(i + "FIN");
//            }
//             if (i % 5 == 0){
//                System.out.println(i + "RA");
//            }
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println(i + "FINRA");
//            }
//            else {
//                System.out.println(i);
//            }
//        }

    }


//    Numbers - Divide without / operator
//> Write a method that can divide two numbers without using division operator
    public static void divide(int num, int den){
        int count = 0;
        while (num >= den){
            count++;
            num -= den;


        }
        System.out.println(count + " r " + num);

    }







}
