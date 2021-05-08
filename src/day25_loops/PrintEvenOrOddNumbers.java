package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        for(int i = 1; i<=100;i++){
            if(i%2==0){
                System.out.println(i + " ");
            }
        }
        System.out.println("\nODD NUMBERS 0 - 100: ");
        for(int k = 0; k <= 100; k++){
            if(k % 2 != 0){
                System.out.println(k + " ");
            }
        }
    }
}
