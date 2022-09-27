package day46_static;

import java.util.ArrayList;
import java.util.Arrays;

    public class CydeoStudent {

    public String name;
    public int numberGroup;

    public static int batchNumber;
    public static String[] instructors; // we have second instructors
    public static String schoolName;


    // you can assign and declare at the same time, but it is not recommend, we will use static block to assign
    static {
        batchNumber = 26;
        instructors = new String[]{"Mehmet", "Nadir", "Austin", "Aysun", "Saim"};
        schoolName = " Cydeo";
        ptintInfo();
    }


    public CydeoStudent(String name, int numberGroup) {
        this.name = name;
        this.numberGroup = numberGroup;
    }

    public static void ptintInfo(){
        System.out.println("School name" + schoolName);
        System.out.println("Batch Number " + batchNumber);
        System.out.println("Instructors " + Arrays.toString(instructors));
    }


    @Override
    public String toString() {
        return "CydeoStudent " +
                " name = " + name  +
                ", numberGroup = " + numberGroup;
    }
}
