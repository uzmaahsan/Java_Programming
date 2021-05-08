package day13_conditional_statements;

public class IFWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = false;
        if (isHungry == true) {
            System.out.println("I am hungry");
            System.out.println(" Then code java");
        } else {
            System.out.println("i am not hungry , i will keep coding java");
        }
        double price = 130.44;
        boolean isAffordable = 200 <= 200;

        isAffordable = true;
        System.out.println("isAffordable =" + isAffordable);
        if (price < 200) {
            System.out.println("Too expensive, lets keep coding java");

        }
        boolean isremoteJob = true;
        if ( ! isremoteJob == true){
        System.out.println("sorry i am not intersted");
    } else {


        System.out.println("sure, i am intersted , what is the interview process ");
    }

    }
}


