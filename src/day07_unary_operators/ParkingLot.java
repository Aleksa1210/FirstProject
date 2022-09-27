package day07_unary_operators;

public class ParkingLot {
    public static void main(String[] args) {

        int car = 10;

        System.out.println(" 2 cars drive into the parking lot");
        // approach 1:

        car = car + 2;
        System.out.println(car);

        System.out.println("2 cars drive in");

        // approach 2:
        car++;
        car++;
        System.out.println(car);


        System.out.println("5 cars left");
        car = car - 5;
        System.out.println(car);



    }
}
