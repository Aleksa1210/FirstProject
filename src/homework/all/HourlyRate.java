package homework.all;

public class HourlyRate {
    public static void main(String[] args) {
        double hourlyRate = 20.5;
        double hoursWork = 44;
        double netPay;
        String message;

        if (hoursWork >40) {
            // when the number is more than or = to 40, we get an extra 1.5 fpr overtime pay
           double overtimeHours = hoursWork - 40;
           netPay = 40 * hourlyRate;
           netPay += overtimeHours * hourlyRate * 1.5;
           message = "You worked " + hoursWork + " jours at a rate of " + hourlyRate + ", but " + overtimeHours + " of the hours were overtime, so you got an additional pay for those hours. Your not pay was " + netPay;


        } else {
            // when the number is less than or = to 40, we will run this code
            netPay = hoursWork * hourlyRate;
            message = "You worked " + hoursWork + " jours at a rate of " + hourlyRate + " there was no overtime";

        }
        System.out.println(message);






    }
}
