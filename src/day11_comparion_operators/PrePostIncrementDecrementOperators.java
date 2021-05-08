package day11_comparion_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //post increment
        int num3 = 8;
        int num8 =  num3;
        num3++;
        System.out.println("num3= " + num3);
        System.out.println("num8 = " + num8);
        int cars =5;
        System.out.println(++cars);
        int sedans = 10;
        System.out.println(sedans++);
        System.out.println(sedans);
        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c );




    }
}
