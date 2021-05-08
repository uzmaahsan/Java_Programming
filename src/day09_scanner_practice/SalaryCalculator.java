package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate");
        double hourlyRate = scan.nextDouble();
        double weeklypay = hourlyRate * 40;
        double montlypay = weeklypay * 52/ 12;
        double annualpay =  montlypay * 12;
        System.out.println(" weekly pay:" + weeklypay);
        System.out.println("montlypay:" + montlypay);
        System.out.println("annualpay:" + annualpay);





    }

}
