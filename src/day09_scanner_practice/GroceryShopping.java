package day09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args) {
        Scanner Scan =new Scanner(System.in);
        System.out.println("Enter price for the milk ");
        double price1 = Scan.nextDouble();
        System.out.println("Enter price for breasd");
        double  price2 = Scan. nextDouble();
        System.out.println("Enter price of cucumber");
        double price3 = Scan.nextDouble();
        double total= price1 +price2 +price3;
        System.out.println("Total price $:" + total);

    }

}
