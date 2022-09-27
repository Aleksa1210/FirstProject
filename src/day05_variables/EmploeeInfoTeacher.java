package day05_variables;

public class EmploeeInfoTeacher {

    public static void main(String[] args) {

        String firstName, lastName, companyName;
        char gender, suite;
        int age, numberOfPTO;
        double salary;
        boolean isFullTime, isMarried;

        firstName = "James";
        lastName = "Bond";
        companyName = "Special Agent";
        gender = 'M';
        suite = 'D';
        age = 40;
        numberOfPTO = 15;
        salary = 1_000_000; // 1,000,000
        isFullTime = true;
        isMarried = false;


        String fullDetails = "Employment information for " + firstName + " " + lastName + " " + "\n" + " at " + companyName + "currently " + age + " years old\n" + companyName + " is located in suite " + suite + " This years salary comes to $" + salary + "\nOther details: PTO: " + numberOfPTO + " married? " + " full time? " + isMarried;



        System.out.println( fullDetails);










    }
}
