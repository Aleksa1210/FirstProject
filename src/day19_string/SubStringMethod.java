package day19_string;

public class SubStringMethod {
    public static void main(String[] args) {

        String str = "sunday";
        //            012345
        System.out.println(str.substring(1)); // started with number which we put until last number
        System.out.println(str.substring(3));
        System.out.println(str);
        System.out.println("satur" + str.substring(3));

        System.out.println(str.substring(2 , 4)); // not include 4
        System.out.println(str.substring(0,5)); // not include 5
        System.out.println(str.substring(0,6)); // not include 6















    }
}
