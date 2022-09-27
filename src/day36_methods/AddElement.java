package day36_methods;

import java.util.Arrays;

public class AddElement {
    public static int [] addElement (int [] original, int elementToAdd){
        int [] newArray = new int[original.length + 1]; // we make plus more number
        for (int i = 0; i < original.length; i++){
            newArray[i] = original[i];
        }
        // instead of doing a loop ourselves, we could have used Are=rays.copyOf()
        newArray[newArray.length - 1] = elementToAdd; // in the last index put new number
        return newArray;
    }

    public static String [] addElement (String [] original, String element){
        //return null;
        String [] newArr = new String[original.length + 1];
        newArr = Arrays.copyOf(original,newArr.length);
        newArr[newArr.length - 1] = element;
        return newArr;
        }



    public static int [] addElement (int [] original, int [] elementsToAddv){

    int [] newInt = new int[original.length + elementsToAddv.length];
    for (int i = 0, j = 0; i < newInt.length; i++){ // j - different array
        if (i < original.length){
            // added the element from original array in the new array
            newInt[i] = original[i]; // store original to the new position to newInt
        } else {
            // added a new elements to the array
            newInt[i] = elementsToAddv[j++]; //store to the element then incroment, stop when will be end of the array
        }
    }
return newInt;
    }



    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = addElement(a,4);
        System.out.println(Arrays.toString(b));

        String [] ab = { "I", " Have", "fun", "with", "java"};
        String  bc = "big";
        System.out.println(Arrays.toString(addElement(ab, bc)));


        int [] z = {1,2,3,21};
        int [] s = {5, 6,7};
        System.out.println(Arrays.toString(addElement(z,s)));

    }
}
