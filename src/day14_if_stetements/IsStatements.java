package day14_if_stetements;

public class IsStatements {
    public static void main(String[] args) {

        String message;

        int year = 2021;

        if (year >= 1346 && year <= 1353){
        message = "The Black Death";
        } else if (year >= 1665 && year <= 1666){
            message = "Great Plegue of London";
        } else if (year >= 1770 && year <= 1772){
            message = "Russian plague";
        } else if (year >= 1889 && year <= 1890){
            message = "Flu pandemic";
        } else if (year == 1916 ){
          message = "American polio epidemic";
        } else if (year >= 1918 && year <= 1920){
            message = "Spanish Flu";
        } else if (year >= 2009 && year <= 2010){
            message = "H1N1 Swine Flu pandemic";
        } else if (year >= 2014 && year <= 2016){
            message = "West American Ebola epidemic";
        } else if (year >= 2020 && year <= 2021){
            message = "COVID-19";
        } else {
            message = "No pandemic";
        }
        System.out.println(message);






    }
}
