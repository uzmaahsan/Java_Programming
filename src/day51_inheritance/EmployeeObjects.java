package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developers = new Employee();
        System.out.println("developers.calculateSalary(55.0) = " + developers.calculateSalary(55.0));
        double annualDevSalary = developers.calculateSalary(60.0);
        System.out.println("Math.round(annualDevSalary) = " + Math.round(annualDevSalary));
    }
}
