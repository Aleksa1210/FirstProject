package day05_variables;

public class RecapVariables {

    public static void main(String[] args) {

        // Declare variables



        byte numberOfCoffeeCoups;
        double totalPriceOfCoffee;
        int totalStudentInClass;

        // We cannot print the variables because they don't have a value
//      System.out.println(numberOfCoffeeCoups);
//      System.out.println(totalPriceOfCoffee);
//      System.out.println(totalStudentInClass);

        // Assigning to variable

        numberOfCoffeeCoups = 2;
        totalPriceOfCoffee = 10.25;
        totalStudentInClass = 432;

        System.out.println(numberOfCoffeeCoups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalStudentInClass);

        System.out.println(numberOfCoffeeCoups + "\t" + totalStudentInClass); // we use concatenation to print the values of two variables at the time

        // Declare and assign

        double temperature = 20.6;
        int javaDays = 5;
        System.out.println("\nThis is my temperature " + temperature);
        System.out.println("It is day " + javaDays + " in the java class");






    }


}
