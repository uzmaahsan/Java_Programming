package day23_string_manipulation_while_loops;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 1;
        if (i <= 5) {
            System.out.println(i);
            while (i <= 5) {
                System.out.println(i);
                i++;

            }
        }

        int apples=0;
        while (apples<=10){
            System.out.println("apple->" + apples);
            apples++;
        }
        System.out.println("apples = " + apples);
    }
}
