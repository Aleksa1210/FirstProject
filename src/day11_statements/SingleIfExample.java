package day11_statements;

public class SingleIfExample {
    public static void main(String[] args) {

        if (false) {
            System.out.println("Hello World");
        }

        System.out.println("Second line");

        if (true) {
            System.out.println("Today is Monday");
        }

        int score = 80;
        if (score >= 75) {
            System.out.println("Passing");
        }


        int year = 2022;
        boolean lockdown = year == 2020 || year == 2021;
        if (lockdown) {
            System.out.println("Stay at home");
            System.out.println("Practice java");
            System.out.println("Wear mask");
        }

        if (!lockdown){
            System.out.println("Party");
            System.out.println("Still practice java");
            System.out.println("Travel");

        }




    }

}
