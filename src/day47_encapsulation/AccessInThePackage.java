package day47_encapsulation;

public class AccessInThePackage {
    // different class, same package
    public static void main(String[] args) {
        //Instance
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
        System.out.println(obj.b);
     //   System.out.println(obj.c);

        //Static
        System.out.println(AccessModifier.x);
        System.out.println(AccessModifier.y);
     //   System.out.println(AccessModifier.z);

        // access all the information
    }
    // c and z not accessible outside the class because they were private
}
