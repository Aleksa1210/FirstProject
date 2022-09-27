package day06_arithmetic_operators;

public class Pizza {
    public static void main(String[] args) {

        String typeOfPizza = "Cheese";
        int numberOfSlices = 8;
        int theNumberOfPeopleEating = 2;
        int personGet1 = 4;
        int personGet2 = 4;
        int sliceLeft = 0;


        System.out.println( numberOfSlices / theNumberOfPeopleEating);
        System.out.println((personGet1 + personGet2) - numberOfSlices);



        String typeOfPizza1 = "Cheese";
        int numberOfSlices1 = 10;
        int theNumberOfPeopleEating1 = 4;
        int slicesPerPerson1 = numberOfSlices1 / theNumberOfPeopleEating1;
        int sliceLeft1 = numberOfSlices1 % theNumberOfPeopleEating1;

        String repost = " We order " + typeOfPizza1 + " pizza with " + numberOfSlices1 + " slices " + theNumberOfPeopleEating1 + " people ate " + slicesPerPerson1 + " each with " + sliceLeft1 + "left over";

        System.out.println(repost);





    }
}
