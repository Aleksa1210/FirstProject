package day24_loops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String s = "abcadbc";
        String unique = "";


        for (int i = 0; i < s.length(); i++){



            if (!unique.contains("" + s.charAt(i))){
                unique += s.charAt(i); // read every character s.charAt(i);


            }
        }
        System.out.println(unique);










    }
}
