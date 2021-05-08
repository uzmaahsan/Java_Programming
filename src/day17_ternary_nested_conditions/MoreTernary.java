package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 35;
        String reply = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("reply = " + reply);
        String todaysClass = "java";
        String teachers = (todaysClass.equals("java")) ? "saim/morudil" : "Nadir";
        System.out.println("teachers = " + teachers);
        
        boolean iseligibleToDrive = false ;
        String driving = iseligibleToDrive ? "YES,have DL" : "NO DL; cannot drive";
        System.out.println("driving = " + driving);
    }
}
