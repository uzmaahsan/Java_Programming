package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));
        System.out.println(company.contains("space"));
        if (company.contains(" ")) {
            System.out.println("multiple words compant names");
        } else {
            System.out.println("single word company name");

            String etsyTitle = "wooden spoon | Etsy";
            if (etsyTitle.contains(" | ")) {
                System.out.println("Pass - title check passed");


            } else {
                System.out.println("Fail - title check failed");
            }
        }
        String email = "maya_y2k@hotmail.com";
        if(email.contains("ya") && email.endsWith(".com")){
            System.out.println("vaild email");

        }else{
            System.out.println("Invalid email");
        }
    }
}