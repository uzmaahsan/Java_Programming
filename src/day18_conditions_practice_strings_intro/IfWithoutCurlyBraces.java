package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "java";

        if (todaysClass.equals("java")) {
            System.out.println("java is fun");
            System.out.println("second statement");
        } else
            System.out.println("it is not java.it is");


        int score = 1;
        if (score == 1) {
            System.out.println("lowest score 1");

        } else if (score == 2) {
            System.out.println("score is 2");
        } else if (score == 3) {

        }
    }
}






