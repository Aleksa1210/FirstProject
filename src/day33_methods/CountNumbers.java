package day33_methods;

public class CountNumbers {

    public static void count (int number){

        for (int i = 0; i <= number; i++){
            System.out.print(i + " ");
        }

        System.out.println();
    }




    public static  void  main(String[] args){
        count(5);
        count(10);
        count(25);
        count(-100);
    }










}
