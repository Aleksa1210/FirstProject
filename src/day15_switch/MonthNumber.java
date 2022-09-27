package day15_switch;

public class MonthNumber {
    public static void main(String[] args) {

        int num = 11;
        String type = "";



        switch (num){
            case 1:
            case 2:
            case 12:
                type = "winter";
                System.out.println("It is " + type + ",so wear a winter coat, gloves and a hat");
                break;
            case 3:
            case 4:
            case 5:
                type = "spring";
                System.out.println("It is " + type + ",so you can wear warm sweater without coat");
                break;
            case 6:
            case 7:
            case 8:
                type = "summer";
                System.out.println("It is " + type + ",so be careful it is hot. Take water");
                break;
            case 9:
            case 10:
            case 11:
                type = "fall";
                System.out.println("It is " + type + ",so wear a warm clothes, it is getting cold.");
                break;










        }







    }
}
