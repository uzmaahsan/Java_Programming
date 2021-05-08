package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city1 = "Boston";
        String city2 = "Tampa";
        if( city1.equals("Moscow") || city2.equals("Tampa") ){

            System.out.println("i am willing to relocate to " + city1);
        }else{
            System.out.println("Not considering -" + city2);
        }
        String teacher = "Saim";
        if(teacher.equals(" Saim ") || teacher.equals("Murodil")){
            System.out.println("its java class with" + teacher);
        }else if( teacher.equals("Nadir")){
            System.out.println("Soft sills class with " + teacher);
        }else{
            System.out.println("some other class " + teacher);
        }
        // company- "Google" , salary >= 100k
        String company = "Nadir Tech";
        Double salary = 105_000.0;
        if(company.equals("Google") || salary >= 100_000){
            System.out.println("accepting offer from company " + company);
        }else{
            System.out.println("rejecting offer " + company);
        }
    }
}
