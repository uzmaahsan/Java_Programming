package day18_conditions_practice_strings_intro;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your last 4 digit of SSN");
        int last4ssn = scan.nextInt();
        System.out.println("please enter your pin number");
        int pinNumber = scan.nextInt();
        if (last4ssn == 1111) {

        }
        if (pinNumber == 9999) {
            System.out.println(" Authentication passed");
        } else {
            System.out.println(" Authentication failed");
        }
    }

}






