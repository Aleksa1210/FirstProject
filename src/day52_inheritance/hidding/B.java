package day52_inheritance.hidding;

public class B extends A{

    @Override
    public void instanceMethodA(){
        staticMethod();
    }

   // @Override we cannot override static methods, but we can declare this method and the staticMethod from parents class will become hidden
    public static void staticMethod(){
        System.out.println("Static method from the CHILD class");
    }

}
