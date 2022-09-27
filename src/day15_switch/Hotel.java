package day15_switch;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the hotel Freedom\n\tHow many days they will stay at the hotel?");
        int day = input.nextInt();
        System.out.println("How many people are staying in the room?");
        int people = input.nextInt();

        String roomType = "";
        int numberRooms = 0;
        int size = 0;



        switch(numberRooms){
            case 1:
                roomType = "single room";
                day = day * 100;
                people = 1;
                break;
            case 2:
                roomType = "double room";
                day = day * 125;
                people = 2;
                break;
            case 3:
                roomType = "large room";
                day = day * people * 150;

                break;
            case 4:
                roomType = "suite";
                day = day * 5000;

                break;
            default:
                System.out.println("orry we don't have any available rooms for that size party");
                break;






        }









    }
}
