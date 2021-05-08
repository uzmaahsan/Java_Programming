package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technology = "java, html, css, selenium, testng, maven, cucumber";
        System.out.println(technology.indexOf(","));//4
        System.out.println(technology.lastIndexOf(","));//40
        int indexOfJava =technology.indexOf("java");
        System.out.println("java ia at index " +indexOfJava );
        int idxOfCss = technology.indexOf("css");
        System.out.println("css is at index " + idxOfCss );
        int indexOfCucumber =technology.indexOf("cucumber");
        System.out.println("cucumber is at index " + indexOfCucumber );
        int indexOfSql=technology.indexOf("sql");
        System.out.println("sql is at index " + indexOfSql);
        if(technology.contains("maven")){
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }
    }
}
