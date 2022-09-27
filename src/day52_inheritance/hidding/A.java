package day52_inheritance.hidding;

public class A {

    public void instanceMethodA(){ // instance method, belong to the object
        System.out.println("Instance method from class A");
    }


    public static void staticMethod(){ // static method, belong to class
        System.out.println("Static method from PARENT class");
    }

}
