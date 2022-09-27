package day51_inheritance.access.b;

import day51_inheritance.access.a.First;

public class Four extends First {

    // different class and different package
    // with inheritance

    public static void main(String[] args) {

        First obj = new First();
        System.out.println(obj.one);
      //  System.out.println(obj.two);
     //   System.out.println(obj.three);
      //  System.out.println(obj.four);

        Four obj2 = new Four();
        System.out.println(obj2.one); // public
        System.out.println(obj2.two); // protected
    }

    // line 14 trying to directly access a protected variable outside of the package. You cannot directly access any rotected information outside of the package'

    // line 19 we are able to access the two variable it is inherited from the First class to the Four class, so the two variable belongs to the object of the Four class ( sub class)
}
