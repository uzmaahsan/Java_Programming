package day15_logicalops_switch_ternary;

public class ORLogicalOperators {
    public static void main(String[] args) {
        System.out.println("true || true =" + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true =" + (false || true));
        System.out.println("false || false = " + (false || false));
        int apples = 5;
        int oranges = 3;
        System.out.println(apples > 3 || oranges > 4);
        if (apples > 3 || oranges > 4) {
            System.out.println("no need to buy more fruit today");
        }
    }
}