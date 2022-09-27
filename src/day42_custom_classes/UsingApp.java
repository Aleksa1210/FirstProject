package day42_custom_classes;

import java.util.Scanner;

public class UsingApp {
    public static void main(String[] args) {

        App cydeo  = new App();

        cydeo.name = "Cydeo";
        cydeo.version = 5.5;
        cydeo.isFree = true;


        // we can't call instance methods like this
        // App.run();
        //App.update();


        // right way
        cydeo.run(); // wrote that is running from class App
        cydeo.update(); // added + 1.1 from class App
        System.out.println(cydeo.name);
        System.out.println(cydeo.version);
        System.out.println(cydeo.isFree);

        // System.out.println(cydeo); // memory will see

      //  new App().run(); // this creates objects with no reference (not value)  and calls the run method (null )

        System.out.println(new Scanner(System.in).nextLine());
       // System.out.println(input.nextLine); // we don't have access (no Scanner object to use)
    }
}
