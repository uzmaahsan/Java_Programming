package day14_multi_branch_if_statements;

public class IfWithoutElse {
    public static void main(String[] args) {
        int year =2020;
        if(year==202){
            System.out.println("covid 19 pandemic year");
            System.out.println("wear mask and keep distance");
        }
        String country = "USA";
        if( country.equals("USA")){
            System.out.println("Washington DC is capital");
            System.out.println("White house is on Pennsyvania ave");
        }
        System.out.println("Welcome to " + country );
    }
}
