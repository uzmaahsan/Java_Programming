package day29_nestedloops_arrays;

public class StarNestedLoop {
    public static void main(String[] args) {
        for (int outer = 1; outer <= 5; outer++) {
            for (int inner = 1; inner <= 10; inner++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for(int outer =1;outer <100;outer++){
            for(int inner = 1; inner <= outer; inner++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}