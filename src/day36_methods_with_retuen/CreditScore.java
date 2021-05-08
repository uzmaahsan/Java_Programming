package day36_methods_with_retuen;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(815);
        checkEligible(600);
        checkEligible(400);
        System.out.println(getCreditScore());

    }
    public static void checkEligible(int creditScore){
        if(creditScore>=700){
            System.out.println("Your are eligible for this car");
        }else{
            System.out.println("sorry you are not eligible for leasing this car");
        }
        int score = getCreditScore();
        System.out.println("score = " + score);

    }
    public static int getCreditScore(){
        return 800;
    }
}
