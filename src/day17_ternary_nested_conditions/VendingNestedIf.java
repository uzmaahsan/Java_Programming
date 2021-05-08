package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "snack";
        String drinkitem = "tea ";
        String snacks = "chips";
        if(selection.equals("drink")){
            System.out.println("drink option is selected");
            if(drinkitem.equals("tea")){
                System.out.println("tea item is selected");


            }else{
                System.out.println("coke item is selected");

            }

            }else if(selection.equals("snacks")) {
            System.out.println("snack option is selected");
            if(selection.equals("chips")){
                System.out.println("chips option is selected");
            }
        }
    }
}
