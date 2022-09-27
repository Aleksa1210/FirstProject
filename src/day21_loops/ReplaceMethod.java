package day21_loops;

public class ReplaceMethod {
    public static void main(String[] args) {

        String s = "java is a language";
        s = s.replace('a', 'e');
        System.out.println(s);

        String day = "today is monday. we will monday. its monday";
        day = day.replace("monday" , "tuesday");
        System.out.println(day);


        String str = "today is monday. we will monday. its monday";
        System.out.println(str.replaceFirst("monday" , "tuesday")); // replace only first word

        String ex = "today is monday. we will monday. its monday";
        int indexFirst = ex.indexOf('.');
        int indexSecond = ex.lastIndexOf('.');

        String middleStr = ex.substring(indexFirst , indexSecond);
        middleStr = middleStr.replace("monday", "weekday");
        System.out.println(ex.substring(0, indexFirst + 1)+ middleStr + ex.substring(indexSecond) );












    }
}
