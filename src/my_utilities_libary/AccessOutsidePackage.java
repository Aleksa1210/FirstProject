package my_utilities_libary;

import day47_encapsulation.AccessModifier;

public class AccessOutsidePackage {
    public static void main(String[] args) {
        //different class, different package

        //Instance
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
       // System.out.println(obj.b);
      //  System.out.println(obj.c);

        //Static
        System.out.println(AccessModifier.x);
       // System.out.println(AccessModifier.y);
      //  System.out.println(AccessModifier.z);

        // access all the information
    }
    // c and z not accessible outside the class because they were private
    // b and y are default (didn't have any other access modifier), so they have access only in the same package

    // so what is accessible outside a package "public"
}
