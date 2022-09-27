package homework.all;

public class Class1 {
  /* Create a method that accept an int array. Take the sum of all the numbers
and print the result
   */
  public static void main(String[] args) {

      int [] arr = {1, 2, 3, 4, 5};
      int sum = 0;

      for (int i = 0; i < arr.length; i++){
          sum += arr[i];
      }
      System.out.println(sum);







  }



}
