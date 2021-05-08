package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "snowy";
        if (weather.equals("sunny")) {
            System.out.println(weather + " Go to park and code java");

        } else if (weather.equals("rainy")) {
            System.out.println(weather + " -stay at home, drink tea , and code java");
        } else if (weather.equals("snowy")) {
            System.out.println(weather + "clean the car and build the snowman, drink hot chocolate");
        } else if (weather.equals("windy")) {
            System.out.println("get ready for powerloss, fly the kite , and keep doing java");

        } else {
            System.out.println("keep doing jav");
        }
    }
}