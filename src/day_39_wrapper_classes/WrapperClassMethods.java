package day_39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10 , 5));
        System.out.println(Integer.sum(50 ,35));
        System.out.println(Integer.min(5 ,2));
        System.out.println("MIN IN: " + Integer.MIN_VALUE);
        System.out.println("MAX INT: " + Integer.MAX_VALUE);
        System.out.println((Double.max(234.4,23.9)));
        System.out.println("MIN IN: " +  Double.MIN_VALUE);
        System.out.println("MAX INT: " + Double.MAX_VALUE);
        System.out.println(Double.compare(5 ,1));
        System.out.println(Double.compare(5 ,45));//-1 first is smaller then second
        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('Q'));
        String word = "Java is Fun";

        }
    }


