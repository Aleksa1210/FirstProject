package day33_methods;

public class MyMathClass {

    public static void add(double numOne, double numTwo){
        System.out.println(numOne + " + " + numTwo +  " = " + (numOne + numTwo));

    }

    public static void subtract(double numOne, double numTwo){
        System.out.println(numOne + " - " + numTwo + "  = " + (numOne - numTwo));

    }

    public static void multiply(double numOne, double numTwo){
        System.out.println(numOne + " * " + numTwo +  " = " + (numOne * numTwo));

    }
    public static void division(double numOne, double numTwo){
        System.out.println(numOne + " / " + numTwo +  " = " + (numOne / numTwo));
    if (numTwo != 0){
    System.out.println("Cannot divide by 0");
    }else {

    }
    }

    public static  void  main(String[] args){
        add(4.5, 6.1);
        add(4, 6);
       // int a = add(3.4, 12.2); i can't do it, because it void method here is nit math, we cannot assighn anything, because out methods are void, there is no return
        division(4, 0);
        multiply(3,3);
        subtract(10, 5);
    }









}
