package day51_inheritance.access.b;

import day51_inheritance.access.a.First;

public class Third {

    // different class and different package
    public static void main(String[] args) {

        First obj = new First();
        System.out.println(obj.one);
    //    System.out.println(obj.two); // two is protected, no inheritance, so no visibility
    //    System.out.println(obj.three); // three is default , only visible in the same package
    //    System.out.println(obj.four); //  four is private, only visible in the same class
    }
}
