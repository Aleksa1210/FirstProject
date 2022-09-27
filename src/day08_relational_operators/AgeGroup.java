package day08_relational_operators;

public class AgeGroup {
    public static void main(String[] args) {

        int age = 20;
        boolean isKid = age <= 13;
        boolean isSenior = age >= 65;


        System.out.println("You are a kid " + isKid);
        System.out.println("Uou are a senior citizen " + isSenior);


        int age1 = 13;
        boolean isKid1 = age1 <= 13;
        boolean isSenior1 = age1 >= 65;


        System.out.println("You are a kid " + isKid1);
        System.out.println("Uou are a senior citizen " + isSenior1);



    }

}
