package day26_loops;

public class NestedLoopExample {
    public static void main(String[] args) {

       for (int i = 0; i < 5; i++){
           System.out.println("Hello World");
       }
        System.out.println("Hello Universe\n");

        for (int i = 0; i < 5; i++){
            System.out.println("Hello World");
        }
        System.out.println("Hello Universe\n");

        for (int i = 0; i < 5; i++){
            System.out.println("Hello World");
        }
        System.out.println("Hello Universe\n");


        System.out.println(" ____________________________ ");


        // outer loop (outside)
        for (int j = 0; j < 3; j++) {  //int j = 1; j <= 3 both give 3 executions/iteration ( 3 times repeat all code)

            for (int i = 0; i < 5; i++) {  // 5 times repeat all sentence
                System.out.println("Hello World");
            }
            System.out.println("Hello Universe\n");
        }






















    }
}
