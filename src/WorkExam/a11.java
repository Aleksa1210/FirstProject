package WorkExam;

public class a11 {
    public static void main(String[] args) {


        String a = "1234";
        int sum = 0;

        for (int i = 0; i < a.length(); i++){
            sum +=Integer.parseInt(Character.toString(a.charAt(i))); // we are going from the right to left
        }
        System.out.println(sum);














    }
}
