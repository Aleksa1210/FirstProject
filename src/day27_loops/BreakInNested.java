package day27_loops;

public class BreakInNested {
    public static void main(String[] args) {

      for (int i = 0; i < 5; i++){
          System.out.println(i + " i ");
          if (i == 3){
              // break; when the above break statment it run we stop thr outer loop which, means both will not longer run. We get 3 full iteration of thr outer loop, incliding thr inner loop running start to finish then when i is equal to 3 the outer loop will stop
          }

          for (int j = 0; j < 5; j++){

              System.out.println(j + " j ");
              // break; if the break is here, the outer iterate fully, but inner loop will execute the first iteration and then the break runs, which stops the inner loop. Code resumes after the outer loop iterations finished
          }

          System.out.println();
        //  break; if the break is here, the first iteration of the outer will run then the outer loops stops

      }







    }
}
