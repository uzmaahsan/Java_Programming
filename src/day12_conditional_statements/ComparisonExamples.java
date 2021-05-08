package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedlimit = 55;
        boolean isspeeding = currentSpeed > speedlimit;
        System.out.println(" Are you speeding = " + isspeeding );
        System.out.println("currentSpeed = " +currentSpeed );
        System.out.println(" speedlimit = "  +  speedlimit);

        double accountBalance = 250.25;
        double itemPrice = 100.99;
        boolean canAfford = accountBalance>=itemPrice;
        System.out.println("can Afford = " + canAfford);

        //decrease balance by itemPrice. using shorthand operator
        accountBalance = accountBalance -  accountBalance;
        accountBalance -= itemPrice;
        boolean isBroke =  accountBalance <= 0;
        System.out.println("Am i broke ? = " + isBroke);
    }
}
