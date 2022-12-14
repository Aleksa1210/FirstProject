package day13_if_statements;

public class TernanyExamples {
    public static void main(String[] args) {


        int a = 4;
        String evenOrOdd;
        if (a % 2 == 0){
            evenOrOdd = "Even";
        } else {
            evenOrOdd = "Odd";
        }
        System.out.println(evenOrOdd);


        String result = a % 2 == 0 ? "Even" : "Odd"; // different way for use If
        System.out.println(result);

        System.out.println("---------------------------");

        int num = 4;
       String posOrNeg;

       if (num >0){
           posOrNeg = "positive";
       } else if(num < 0){
           posOrNeg = "negative";
       } else {
           posOrNeg = "zero";
       }
        System.out.println(posOrNeg);

       String sign = (num > 0) ? "positive" : (num < 0) ? "negative" : "zero";
        System.out.println(sign);

        System.out.println("----------------------");

        int time = 12;
        double price;

        if (time >= 10 && time <= 15){
            price = 7.99;
        } else {
            price = 10.99;
        }
        System.out.println(price);


        double ternaryPrice = (time >= 10 && time <= 15) ? 7.99 : 10.99;
        System.out.println(ternaryPrice);
        System.out.println((false) ? "hello" : "bye");







    }
}
