package day34_methods;

public class CreditScore {

    public static void main(String[] args) {
        getCreditScore(); // this value is not used
        int score = getCreditScore();
        System.out.println(score);

        System.out.println(getCreditScore());
        System.out.println(getCreditScore() + 50);

        System.out.println(isGoodCreditScore(980));  // write value here

        System.out.println(isGoodCreditScore(500) ? "Good Score" : "Bed Score");

    }

    public static int getCreditScore(){
        return 800;

    }

    public static boolean isGoodCreditScore(int creditScore){
        if (creditScore >= 700){
            return true;
        } else {
            return false;
        }
    }



}
        /* public static boolean isGoodCreditScore(int creditScore){
            return creditScore >= 700;
        } */