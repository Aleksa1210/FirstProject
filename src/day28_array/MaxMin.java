package day28_array;

public class MaxMin {
    public static void main(String[] args) {





        int[] num  = {500, 120, -80, 90, 250, -10};
        int max = num[0];
        int min = num[0];



        for (int i = 0; i < num.length; i++){

            int number = num[i]; // dont repeat max > num[0] || max > num[1] -> we use int number = num[i];

            if (number > max){
                max = number; // it is mean that max number will == number
            }
            if (number < min){
                min = number; // it is mean that min number will == number
            }
        }
        System.out.println(" max " + max);
        System.out.println(" min " + min);









    }
}
