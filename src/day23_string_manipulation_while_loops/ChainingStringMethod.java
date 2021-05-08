package day23_string_manipulation_while_loops;

import java.util.Locale;

public class ChainingStringMethod {
    public static void main(String[] args) {
        String city = "ISTANBUL";
        System.out.println(city.substring(0,1).toUpperCase() +city.substring(1).toLowerCase());
        String capitalized = city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);

    }
}
