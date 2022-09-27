package day33_methods;

import java.util.Arrays;

public class OurArrayClass {


    public static void firstElement (int [] nums){
        System.out.println("First Element " + nums[0]);
    }

    public static void lastElement (int [] nums2){
        System.out.println("Last Element " + nums2[nums2.length - 1]);
    }


    public static void middleElement (int [] nums3){ // 1,2,3,4,5
      if (nums3.length % 2 == 0){
          System.out.println("First Middle" + nums3[nums3.length / 2 -1]); // which you can /2 (8/2 =4)
          System.out.println("Second Middle" + nums3[nums3.length / 2]); // which you can /2
      } else {
          System.out.println("Middle: " + nums3[nums3.length / 2]);  // 7/2 = 3.5
      }
    }
    public static  void  printArray (int[] nums){
        String result = "START |";
        for (int num :nums){
            result += num + " - ";
        }
            result += " | END";
            System.out.println(result);

    }


    public static  void  main(String[] args){
        int [] numbers = { 50, 0 , 10, 500, 20, 40, 124};

        firstElement(numbers);
        lastElement(numbers);
        middleElement(numbers);

        int [] numbers2 = { 50, 0 , 10, 500, 20, 40, 124, 19};
        middleElement(numbers2);


        printArray(numbers2);
        printArray(new int[]{40, 20, 10});

        }












}
