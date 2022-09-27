package day05_variables;

public class House {
    public static void main(String[] args) {

        String houseType, address;
        int numberOfBedroom, numberOfKitchens, zipcode, numberBathroom;
        double costOfTheHouse;
        boolean isTherebasement, isThereAttic, isThereAPool, isThereHouseForSale, isParkNearBy;

        houseType = " vila";
        address = " 3052 Bright Street";
        numberOfBedroom = 4;
        numberOfKitchens = 3;
        numberBathroom = 3;
        zipcode = 10810;
        costOfTheHouse = 20_000_000;
        isTherebasement = true;
        isThereAttic = true;
        isThereAPool = false;
        isThereHouseForSale = false;
        isParkNearBy = true;

        String fullDetails = "The " + houseType + " on " + address + " " + " " + zipcode + " " + "\nThe house has: bedrooms " + numberOfBedroom + " kitchen " + numberOfKitchens + " bathroom " + numberBathroom + "\nThe house cost $" + costOfTheHouse + "\nIs there basment? " + isTherebasement + "\nIs there attic? " + isThereAttic + "\nIs there pool? " + isThereAPool + "\nDo you sell house? " + isThereHouseForSale + "\nIs there are parking? " + isParkNearBy;

        System.out.println(fullDetails);




    }



}
