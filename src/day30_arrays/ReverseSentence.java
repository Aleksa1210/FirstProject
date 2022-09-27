package day30_arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String str = "today is monday";
        String [] days = str.split(" ");

        String reversed = "";

        for (int i = days.length - 1; i >= 0; i--){
            reversed += days[i] + " ";
        }
        System.out.println(reversed.trim());













    }
}
