package day52_inheritance.final_example;

public class UseFinalExample { // we cannot inherited because the class was final
    public static void main(String[] args) {


        System.out.println(FinalExample.PLANET);
       // FinalExample.PLANET = "Mars"; we cannot change the final variable

        FinalExample obj = new FinalExample(20);
        System.out.println(obj.a); // cannot be change
        System.out.println(obj.b); // we cannot change more than 1 time, because we didn't give value in the contractor

        //obj.a = 4; cannot be change
        System.out.println();
        FinalExample obj2 = new FinalExample(100);
        System.out.println(obj2.b);
        System.out.println(obj2.a);


    }

}
