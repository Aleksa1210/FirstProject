package WorkExam;

public class EvenOdd {
    public static boolean checkPrime (int n) {

        if (n % 2 == 0){
            System.out.println("Prime");
            return true;
        } else {
            System.out.println("not prime");
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPrime(2));
    }
}
