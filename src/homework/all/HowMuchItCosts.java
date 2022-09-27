package homework.all;

public class HowMuchItCosts {
    public static void main(String[] args) {


/* The length of the movie will determine how much it costs.
declare and assign a variable for the duration of the movie
The length will be given as a decimal as hours.minutes
curation of less than or equal to 0:
Movies cannot be less than 0 minutes
duration of more than 4:
Movies cannot be more than 4 hours
for all other duration uses the following values to display the
price of the tickets
duration --> price
1.0 --> 8.99
1.5 --> 10.50
2.0 --> 12.99
2.5 --> 14.50
3, 3.5 or 4 --> 15.99
 */
    double time = 2.5;
    double ticket1 = 8.99;
    double ticket2 = 10.50;
    double ticket3 = 12.99;
    double ticket4 = 14.50;
    double ticket5 = 15.99;


    if (time <= 1.0){
    System.out.println("Your ticket will cost: " + ticket1);
    } else if (time <= 1.5){
        System.out.println("Your ticket will cost: " + ticket2);
    }else if (time <= 2.0){
        System.out.println("Your ticket will cost: " + ticket3);
    }else if (time <= 2.5){
        System.out.println("Your ticket will cost: " + ticket3);
    } else if (time <= 3 && time <= 4.0){
        System.out.println("Your ticket will cost: " + ticket5);
    } if (time < 0){
        System.out.println("Movies cannot be less than 0 minutes");
    } if (time > 4){
        System.out.println("Movies cannot be more than 4 hours");
    }









    }
}
