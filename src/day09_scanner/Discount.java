package day09_scanner;

public class Discount {
    public static void main(String[] args) {

        boolean isItWeekend = true;
        boolean areYouTeacher = true;
        boolean aerYouPoliceOfficer = false;
        boolean areYouFirefighter = false;


        boolean doYouGeTDiscount = isItWeekend &&
                ( areYouFirefighter || areYouTeacher || aerYouPoliceOfficer);

        System.out.println(doYouGeTDiscount);



    }
}
