package day18_conditions_practice_strings_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
        int score=100;
        if(score>=1 && score<=40){
            System.out.println("grade D");
        }else if(score>= 41 && score <= 60){
            System.out.println(" grade c");

        }else if(score>=61 && score<=90){
            System.out.println("grade B");
        }else if(score>=91 && score <=100){
            System.out.println("A");
        }else{
            System.out.println("invalid score=" + score);
        }
        }
    }

