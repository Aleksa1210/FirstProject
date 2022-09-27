package day43_custom_classes;

public class ThisKeyword {

    int a = 101; // instance variable

    public  ThisKeyword (int a){
        a = 400;
        System.out.println(a);
        this.a = 602; // instance variable change value
    }
}
