package day34_void_method;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage();  // call the method
        displayMessage();
        displayMessage();
        for(int i = 1; i < 100;i++){
            System.out.print(i + " - ");
            displayMessage();

        }
}
public static void displayMessage(){
    System.out.println("Hello B22 Friends !");
    System.out.println("Hello B22 second time !");
    System.out.println("Hello B22 THIRDTIME");
}
}