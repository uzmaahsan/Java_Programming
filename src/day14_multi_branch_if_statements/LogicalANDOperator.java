package day14_multi_branch_if_statements;

public class LogicalANDOperator {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true&& false);
        System.out.println(false&&true);
        System.out.println(false&&false);
        System.out.println(10>5&&1==1);
        System.out.println(100>40&&4==1);
        System.out.println(100>40&&4==4);
        System.out.println(88<100&&3==3);
        int apples =10, oranges =5;
        boolean check = apples >6 && oranges>35;
        System.out.println("check" + check);
    }
}
