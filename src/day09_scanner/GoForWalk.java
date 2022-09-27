package day09_scanner;

public class GoForWalk {
    public static void main(String[] args) {

        boolean isItRaining = true;
        int temperature = 80;

        System.out.println(!isItRaining && temperature > 70);


        boolean isItRaining1 = false;
        int temperature1 = 60;

        System.out.println(!isItRaining1 && temperature1 > 70);
        System.out.println("go for walk " + (!isItRaining1 && temperature1 > 70));






    }
}
