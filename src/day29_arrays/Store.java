package day29_arrays;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {

        String [] items = { "Shoes", "Jackets", "Gloves", "AirPod", "Ipod", "Backpack" };
        double [] prices = { 89.99, 150.0, 399.99, 250.0, 439.5, 39.99 };
        int [] itemIds = { 12345, 12346, 12347, 12348, 12349, 12350 };

        // pint catalog

        for (int i = 0; i < items.length; i++){
            System.out.println("Item ID: " + itemIds[i] + " are " + items[i] + " and they cost $ " + prices[i]);

        }
        System.out.println();

        int indexOfClothes = -1;
        for (int j = 0; j < items.length; j++){
            if (items[j].equalsIgnoreCase("gloves")){
               indexOfClothes = j;
               break;
            }
        }
        System.out.println("Index of gloves " + indexOfClothes);

        // most expensive item


       double expensiveItem = prices[0];
        int indexOfExpensive = 0;

        for (int k = 0; k < prices.length; k++){


            if (prices[k] > expensiveItem){
                expensiveItem = prices[k];
                indexOfExpensive = k;
            }
        }
        System.out.println("The most expensive item: ");
        System.out.println("Item " + items[indexOfExpensive]);
        System.out.println("Item ID " + itemIds[indexOfExpensive]);
        System.out.println("Price $" + prices[indexOfExpensive]);














    }
}
