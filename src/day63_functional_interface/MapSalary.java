package day63_functional_interface;

import java.util.HashMap;
import java.util.Map;

public class MapSalary {
    public static void main(String[] args) {
        /*
Create a map that has a couple data to use. The data will be a name as the key and a salary as the value

Use the created map to find the following:

    1.1 who has the maximum salary?
    1.2 who has the minimum salary?
    1.3 how many employees has the salary between 120k ~ 150K?
    1.4 display the names of the employees who are making less than 118k?
    1.5 increase the salary of each employee by 10K
 */


        Map <String, Double> map = new HashMap<>();
        map.put("James",7000.0);
        map.put("Jane",123000.0);
        map.put("Anna",140000.15);
        map.put("Jorge",42452512.23);
        map.put("Elza",123131214.1);
        map.put("Peter",130000.0);


        String nameForLargest = "";
        double maxSalary = 0.0;

        String nameFotLowest = "";
        double minSalary = Double.MAX_VALUE; // the biggest possible double value is a good starting value

        for (String key : map.keySet()){ // iterate through to read rhe values by the key

            double value = map.get(key); // we use get method to read the values by the key

            if (value > maxSalary){
                nameForLargest = key;
                maxSalary = value;
            }
            if (value < minSalary){
                nameFotLowest = key;
                minSalary = value;
            }
        }
        System.out.println("Max salary" + nameForLargest + "- $" + maxSalary);
        System.out.println("Smallest Salary " + nameFotLowest + "- $" + minSalary);


        int counter = 0;
        for (double value : map.values()){
            if (value >= 120_000 && value <= 150_000){
                counter++;
            }
        }
        System.out.println("Number over 120k and less than 150k " + counter);
        System.out.println();


        for (String name : map.keySet()){
            if (map.get(name) <= 118_000){
                System.out.println(name);
            }
        }
        System.out.println();

        for(String key : map.keySet()){
            map.put(key, map.get(key) + 10_000);
        }
        System.out.println(map);





}
}
