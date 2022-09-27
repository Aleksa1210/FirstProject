package day09_scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Alex";
        boolean areTheyCitizen = true;
        boolean doHaveCriminalBackground = false;
        int age = 29;

        boolean isEligibleToVote = age >= 18 && doHaveCriminalBackground && areTheyCitizen;
        System.out.println(name + " is eligible to vote  " + !isEligibleToVote);// true && true && (!false -> true)


        String name1 = "James Bond";
        boolean areTheyCitizen1 = true;
        boolean doHaveCriminalBackground1 = true;
        int age1 = 49;

        boolean isEligibleToVote1 = age1 >= 18 && doHaveCriminalBackground1 && areTheyCitizen1;
        System.out.println(name1 + " is eligible to vote " + !isEligibleToVote1);//(!true -> false)




    }


}
