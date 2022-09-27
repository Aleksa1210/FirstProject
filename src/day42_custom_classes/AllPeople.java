package day42_custom_classes;

public class AllPeople {
    public static void main(String[] args) {


       // System.out.println(name); this not valid



        // creating object of the Person class
        Person namePersonOne = new Person(); // this creates an object of the Person class

        Person namePersonTwo = new Person(); // this creates an object of the Person class for second person

        //Accessing the instance variables


        namePersonOne.name = "Aleksa";
        namePersonOne.age = 40;
        namePersonOne.height = 5.10;
        namePersonOne.isMarried = false;


        // printing in instance variables

        System.out.println(namePersonOne.name);
        System.out.println(namePersonOne.age);
        System.out.println(namePersonOne.height);
        System.out.println(namePersonOne.isMarried);

    // printing the instance variables for personTwo

        System.out.println();

        namePersonTwo.name = "James";
        namePersonTwo.age = 36;
        namePersonTwo.height = 4.10;
        namePersonTwo.isMarried = true;


        System.out.println(namePersonTwo.name);
        System.out.println(namePersonTwo.age);
        System.out.println(namePersonTwo.height);
        System.out.println(namePersonTwo.isMarried);




    }
}
