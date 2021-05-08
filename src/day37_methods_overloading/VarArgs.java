package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10 , 5);
        addNumbers(15,40,60);
        addNumbers(60, 45,67,54,78);
        addNumbers();
    }
    public static void addNumbers(int...nums){
        int sum = 0;
        for(int n : nums){
            sum += n;
            System.out.println("Sum = " + sum);
        }
    }
}
