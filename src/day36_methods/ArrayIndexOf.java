package day36_methods;

public class ArrayIndexOf {
    public static void main(String[] args) {
        int [] a = {12, 20, 30 ,2, 6};
        System.out.println(indexOf(a, 6));
        System.out.println(indexOf(a, 1));
        System.out.println(indexOf(a, 20));

        String [] words = {"java", "apple", "water", "hello"};
        System.out.println(indexOf(words, "hello"));

    }
    public static int indexOf(String [] str, String element){
        for (int i = 0; i < str.length; i++){
            if (str[i].equals(element)){ // for String we can't use ==, we should use .equals
                // every elements / elements which I try ti find
                return i;
            }
        }
        return -1; // if we will not find num will return -1 (like default for index), never find i
    }

    public static int indexOf (int [] nums, int element){ // element if there second will find first

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == element){
                // every elements / elements which I try ti find
                return i;
            }
        }
        return -1; // if we will not find num will return -1 (like default for index), never find i
    }












}
