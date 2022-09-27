package WorkExam;

public class SumArray {
    public static int sum(int [] num) {

        int sum = 0;

        for (int each : num) {
            sum += each;
            System.out.println(sum);


        }
return sum;
    }

    public static void main(String[] args) {
       int [] arr = {1, 2, 3, 4};
        System.out.println(sum(arr));
    }
}
