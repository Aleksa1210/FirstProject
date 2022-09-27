package homework.all;

public class a4 {


    public static void buildEmail (int num1, int num2, int num3){

        if (num1 == 180 || num2 == 180 || num3 == 180){
            System.out.println("This is a triangle");
        }else if (num1 == 360 || num2 == 360 || num3 == 360){
            System.out.println("This is a circle");
        }


    }

    public static  void  main(String[] args){
        buildEmail(2 , 180 , 360);
    }






}
