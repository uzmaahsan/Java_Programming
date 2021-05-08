package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city="Pittsburgh";
        System.out.println(city.equals("Pittsburgh"));
        //EQUALSIGNORECASE() method_ Case INSENSITIVE COMPARISON
        System.out.println(city.equalsIgnoreCase("PITTSBURGH"));
        System.out.println(city.equalsIgnoreCase("PittsBurgh"));
        System.out.println(city.equalsIgnoreCase("pittsbburgh"));
        System.out.println(city.equalsIgnoreCase("Pitts burgh"));


        }
    }

