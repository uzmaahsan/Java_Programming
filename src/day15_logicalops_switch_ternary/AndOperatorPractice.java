package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "jacket";
        if (onSale && freeShipping) {

            System.out.println("adding to cart-" + itemName);

        } else{
            System.out.println("continue shopping for good deals on-" + "!");
            if(freeShipping && onSale && itemName == (" jacket")){
                System.out.println("Add to cart - " + itemName);
                System.out.println("continue shopping for good deals on -" + itemName);
            }//
        }
    }
}