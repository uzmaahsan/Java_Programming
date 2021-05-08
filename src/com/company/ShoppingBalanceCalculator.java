package com.company;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.5;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15.0;
        double remaingBalane = balance - price1 - price2 - price3;
        System.out.println("Your initial balance:$" + balance);
        System.out.println("your remaining balance: $"+remaingBalane);
        int balanceWithNoCents = (int) remaingBalane;
        System.out.println(balanceWithNoCents);
        System.out.println("Your remaingBalane Without Cents: $" + balanceWithNoCents);

    }
}
