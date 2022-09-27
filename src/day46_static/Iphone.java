package day46_static;

public class Iphone {

    String model;
    double price;

    static String company;
    static String os;
    static  boolean appleDay;
    static String day;

    static {
        System.out.println("STATIC BLOCK RUN");
        company = "Apple";
        os = "IOS";
        day = "Wednesday";
        if (day.equals("Friday")){
            appleDay = true;
        }
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price ;
    }

    public Iphone(String model, double price) {
        System.out.println("CONSTRUCTE RUN");
        this.model = model;
        this.price = price;



    }
}
