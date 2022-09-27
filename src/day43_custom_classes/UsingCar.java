package day43_custom_classes;

public class UsingCar {
    public static void main(String[] args) {




        Car infor = new Car();

        infor.model = "Kio";
        infor.color = "Blue";
        infor.year = 2022;
        infor.fuelLevel = 80;

        System.out.println();
        System.out.println(infor);

        System.out.println();
        infor.drive();
        infor.drive();
        System.out.println(infor.fuelLevel);

        System.out.println();
        infor.fillTank();
        System.out.println(infor.fuelLevel);








    }
}
