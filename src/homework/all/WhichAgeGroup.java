package homework.all;

public class WhichAgeGroup {

    public static void main(String[] args) {


       /* declare and assign an age variable
        use these ranges to determine which age group you belong to
        if the given age value is less than 0 or more than 120:
        print: Invalid age
        otherwise uses these to determine the age group
        Baby (2 years and below)
        Toddler (3 - 5)
        Kid (6 - 9
                Pre-Teen (10 - 12)
                Teenager (13 - 17)
                Young Adult (18 - 20)
                Adult (21 - 35)
                Middle-Aged Adult (36 - 55)
                Senior Citizen (55+) */



        int age = 15;
        if ( age >= 10 && age <= 12){
            System.out.println("Pre-Teen");
        }else if (age >= 13 && age <=17){
            System.out.println("Teenager");
        }else if (age >= 18 && age <= 20){
            System.out.println("Young Adult");
        }else if (age >= 21 && age <= 35){
            System.out.println("Adult");
        }else if (age >= 36 && age <= 55){
            System.out.println("Middle-Aged Adult");
        }else if (age>= 55){
            System.out.println("Senior Citizen");
        }
















    }
}
