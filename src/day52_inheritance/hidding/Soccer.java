package day52_inheritance.hidding;

public class Soccer extends Sports{
    public static void cheer(){
        System.out.println("Cheering from the Child class");
    }
}

    /*
    It looks like we are overriding, but we are not, because the method static
    we are hiding the cheer method from parent class
    */