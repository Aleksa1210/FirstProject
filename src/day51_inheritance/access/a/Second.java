package day51_inheritance.access.a;

public class Second {
    public static void main(String[] args) {


        // different class, same package
        First obj = new First();
        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
       // System.out.println(obj.four); // four is not accessible because it is private
    }
}
