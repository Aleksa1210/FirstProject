package day12_if_statements;

public class DayInMonth {
    public static void main(String[] args) {

        int month = 2;
        boolean has31ays = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean has28Days = month == 2;

        if (has31ays) {
            System.out.println("31 days");
        }
        if (has30Days) {
            System.out.println("30 days");
        }
        if (has28Days) {
            System.out.println("28 days");
        }

        if (has31ays) {
            System.out.println("31 days");
        } else  if (has30Days){
            System.out.println("30 days");
        } else  if (has28Days) {
            System.out.println("28 days");
        } else {
            System.out.println("Invalid number for month");
        }



    }
}
