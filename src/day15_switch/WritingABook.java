package day15_switch;

public class WritingABook {
    public static void main(String[] args) {

        String genre = "";
        int pageLength = 0;
        int profit = 0;
        int sequels = 5;
        int countries = 0;
        String type = "Fantasy";


        switch (type){
            case "Fantasy":
                pageLength = 500;
                profit = 1_000_000;
                sequels = 5;
                countries = 50;
                break;
            case "Detective":
                pageLength = 300;
                profit = 750_000;
                sequels = 3;
                countries = 45;
                break;
            case "Science Fiction":
                pageLength = 720;
                profit = 900_500;
                sequels = 4;
                countries = 30;
                break;
            case "Short Story":
                pageLength = 150;
                profit = 300_000;
                sequels = 1;
                countries = 40;
                break;

        }
        System.out.println("Type the book is " + type + " page length " + pageLength + " profit " + profit + " sequels "+ sequels + " countries " + countries);


















    }
}
