package day13_if_statements;

public class Oxygen {
    public static void main(String[] args) {

        int oxygen = 71;
        String message;

        System.out.println("------------------------");

        if (oxygen >= 90) {
            System.out.println("Your tank is full");
        } else if (oxygen >= 80) {
            System.out.println("Still okay");
        } else if (oxygen >= 70) {
            System.out.println("Don't go to far");
        } else if (oxygen >= 60) {
            System.out.println("Start to head back");
        } else if (oxygen >= 50) {
            System.out.println("Be careful now you at 50%");
        } else {
            System.out.println("Dangerous");
        }


        System.out.println("--------------------");

        if (oxygen >= 90) {
           message = ("Your tank is full");
        } else if (oxygen >= 80) {
            message = ("Still okay");
        } else if (oxygen >= 70) {
            message = ("Don't go to far");
        } else if (oxygen >= 60) {
            message = ("Start to head back");
        } else if (oxygen >= 50) {
           message = ("Be careful now you at 50%");
        } else {
            message = ("Dangerous");
        }
        System.out.println(message);




    }
}