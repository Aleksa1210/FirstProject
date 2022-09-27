package day50_inhertance.computer;

public class Lab {
    public static void main(String[] args) {


    Computer obj1 = new Computer("generic os", 300);
        System.out.println(obj1);


        Windows obj2 = new Windows(500);
                    //new Computer("Windows", 500);
        System.out.println(obj2);

        Mac obj3 = new Mac("Mac", 1000);
        System.out.println(obj3);

}}
