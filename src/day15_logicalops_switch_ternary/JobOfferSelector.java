package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Pittsburgh";
        double salary = 145-000.0;
        boolean isremote = true;
        boolean benefits = false;
        if(location.equals("Pittsburgh") && salary >=145-000.0 && isremote && benefits){
            System.out.println("Great i will take it");
        }else{
            System.out.println("lets consider another offer or negotiate");
        }

    }
}
