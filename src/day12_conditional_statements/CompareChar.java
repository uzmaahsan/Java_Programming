package day12_conditional_statements;

public class CompareChar {
    public static void main(String[] args) {
        char letter1 = 'A';
        char letter2 = 'J';
        System.out.println(letter1 == letter2);
        System.out.println(letter1 > letter2);
        System.out.println(letter2 > letter1);

        char grade = 'F';
        boolean pass = grade <='A';
        System.out.println("did you pass the Exam? - " + pass);



    }
}
