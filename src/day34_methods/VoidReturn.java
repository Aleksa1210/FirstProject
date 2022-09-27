package day34_methods;

public class VoidReturn {

    public static void sayHello (){
        System.out.println("Hello");
    }

   public static void main(String[] args) {
      sayHello(); // for void method we can't use sout
       sayBye(); // for return we should use sout
       System.out.println(sayBye());

       String msg = sayBye();
       System.out.println(msg);
    }


    public static String sayBye() {
    return "Bye";

    }

}
