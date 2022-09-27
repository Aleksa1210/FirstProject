package day05_variables;

public class CarInfo {
    public static void main(String[] args) {

        String carModel, driverName;
        int licenNumber, speed;
        boolean isAutomatic;
        char liscenseClass;

        carModel = "Hyundai";
        driverName = "Aleksandra";
        licenNumber = 125;
        speed = 110;
        isAutomatic = true;
        liscenseClass = 'B';


        String fulleDetails = " Car model is " + carModel + " " + " Driver is " + driverName + " " + " Number deriver licen is " + licenNumber + " " + " Speed car is " + speed + " " + " Is car automatic? " + isAutomatic + " " + " What is class? " + liscenseClass;


        System.out.println(fulleDetails);






    }
}
