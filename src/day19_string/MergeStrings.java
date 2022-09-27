package day19_string;

public class MergeStrings {
    public static void main(String[] args) {


        String chara1 = "abc";
        String chara2 = "xyz";

        System.out.println("" + chara1.charAt(0) + chara2.charAt(0) + chara1.charAt(1) + chara2.charAt(1) + chara1.charAt(2) + chara2.charAt(2));



        String a = "abs";
        String b = "XYZ";
        String merged = " ";
        merged += a.charAt(0); // merged = merged + a.chartAt(0)
        merged += b.charAt(0);
        merged += a.charAt(1);
        merged += b.charAt(1);
        merged += a.charAt(2);
        merged += b.charAt(2);
        System.out.println(merged);






    }
}
