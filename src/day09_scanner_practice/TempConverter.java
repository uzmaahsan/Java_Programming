package day09_scanner_practice;
import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("######## F to C Converter program");
        System.out.println("Enter Farenheit valu:");
        double farenheiteValue = input.nextDouble();
        double celciusValue = (farenheiteValue- 32) * 5/9;
        System.out.println("Degrees inFarenheit:"+celciusValue +"Farenheit " );
    }
}
