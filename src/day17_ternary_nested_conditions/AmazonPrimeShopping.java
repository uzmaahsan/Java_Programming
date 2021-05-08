package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        double price = 15.0;
        boolean isPrimeMember = false;
        if(isPrimeMember) {
            System.out.println("Free 2 day shipping Eligiable");

        }else{
            if(price >=25.0) {
                System.out.println("Eligiable for regular shipping");

            }else{
                System.out.println("Not eligiable for free shipping.fee is $10");
            }


        }

    }
}
