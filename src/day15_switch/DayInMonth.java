package day15_switch;

public class DayInMonth {
    public static void main(String[] args) {

        int num = 11;
        String month = "";
        int dayInMonth = 0;


        switch (num){
            case 1:
                month = "January";
                dayInMonth = 31;
                break;
            case 2:
                month = "February";
                dayInMonth = 28;
                break;
            case 3:
                month = "March";
                dayInMonth = 31;
                break;
            case 4:
                month = "April";
                dayInMonth = 30;
                break;
            case 5:
                month = "May";
                dayInMonth = 31;
                break;
            case 6:
                month = "June";
                dayInMonth = 30;
                break;
            case 7:
                month = "July";
                dayInMonth = 31;
                break;
            case 8:
                month = "August";
                dayInMonth = 31;
                break;
            case 9:
                month = "September";
                dayInMonth = 30;
                break;
            case 10:
                month = "October";
                dayInMonth = 31;
                break;
            case 11:
                month = "November";
                dayInMonth = 30;
                break;
            case 12:
                month = "December";
                dayInMonth = 31;
                break;

        }
        System.out.println(num + "in the " + month + " " + dayInMonth);










    }
}
