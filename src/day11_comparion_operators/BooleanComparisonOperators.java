package day11_comparion_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println( "10 == 10");// true 10 = 10
        System.out.println(1000 > 100);
        System.out.println(985.44 < 98547.8);
        System.out.println(10 <= 9);
        System.out.println(100>=99);
        System.out.println(500!=-44);
        System.out.println(3>=5);
        int a = 100;
        int b = 200;
        System.out.println(a == b);
        System.out.println(a> b);
        System.out.println(a<b);
        System.out.println(a >=b);
        System.out.println(a<=b);
        System.out.println(a!=b);

        String city = "Pittsburgh";
        System.out.println(city == "Pittsburgh");
        String name = "Abbas";
        boolean checkName = name == "Abbas";
        System.out.println("checkName = " + checkName);
        checkName = name!= " Kuzzat";
        System.out.println("checkName = " + checkName);
        int age = 2;
        boolean noMoreToddler = age>3;
        System.out.println(noMoreToddler);
        age =66;
        boolean senioirCitizen = age>=65;
        System.out.println("is senior citizen?_" + senioirCitizen);



    }
}
