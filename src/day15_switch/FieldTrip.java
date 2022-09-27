package day15_switch;

public class FieldTrip {
    public static void main(String[] args) {

        int grade = 1;
        String location = "", teacher = "";
        int numberOfGroups = 0;

        if (grade >= 1 && grade <= 6){

            if (grade == 1){
                location = "Apple orchard";
                numberOfGroups = 3;
                teacher = "Ms. Smith";

            }else if (grade == 2){
                location = "Zoo";
                numberOfGroups = 7;
                teacher = "Mr. Lee";

            } else if (grade == 3){
                location = "Aquarium";
                numberOfGroups = 5;
                teacher = "Ms. Wilson";

            }else if (grade == 4){
                location = "Movie theater";
                numberOfGroups = 2;
                teacher = "Ms. Reyes";

            }else if (grade == 5){
                location = "Museum";
                numberOfGroups = 5;
                teacher = "Ms. Lela";

            } else {
                //this one is for grade 6
                location = "Six Flags";
                numberOfGroups = 8;
                teacher = "Mr. Watt";
            }
            System.out.println("Location " + location);
            System.out.println("Number of Groups" + numberOfGroups);
            System.out.println("Teacher in chergw " + teacher);


        } else {
            System.out.println("Grade must be between 1-6");
        }













    }
}
