package day32_arrays_split;

import java.util.Arrays;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        //print Array value as String in same line with no loops.
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));
        System.out.println("-----1) find and print details of most expensive item-----");
        double maxPrice = prices[0]; //assume first price is max
        int indexOfMaxPrice = 0; //assume max price is at index 0

        for(int i = 0; i < prices.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }
        }

        System.out.println("maxPrice = " + maxPrice);
        System.out.println("indexOfMaxPrice = " + indexOfMaxPrice);
        System.out.println(items[indexOfMaxPrice] + " - $" + prices[indexOfMaxPrice] +" - #" +itemIDs[indexOfMaxPrice]);

    }
}





