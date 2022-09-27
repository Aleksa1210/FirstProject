package day47_encapsulation;

public class AccessModifier {


    public int a; // public // access everywhere in the project
    int b; // default // access within the same package
    private int c; // private //access only in the same class

    public static int x;
    static int y;
    private static int z;


    public static void main(String[] args) {
        //Instance
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        //Static
        System.out.println(AccessModifier.x);
        System.out.println(AccessModifier.y);
        System.out.println(AccessModifier.z);

        // access all the information
    }

}
