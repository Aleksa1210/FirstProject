package day24_loops;

public class CountJava {
    public static void main(String[] args) {

        String str = "java is a java language.java";
                    //0123
        int count = 0;


        for (int i = 0; i < str.length() - 3; i++){

            String everyFour = str.substring(i, i + 4);
            // System.out.println(everyFour); you can see how is it count

            if (everyFour.equals("java")){
                count++;

            }
        }
        System.out.println("java " + count);









        // java 0,4   i, i +4
        // ava 1, 5   i, i +4






    }
}
