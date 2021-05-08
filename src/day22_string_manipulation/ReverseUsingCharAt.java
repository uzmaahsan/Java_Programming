package day22_string_manipulation;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "noon";
        System.out.print(word.charAt(0));
        System.out.print(word.charAt(2));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(3));
        System.out.println(word);
        //print using single statement and concatination +
        System.out.println("" + word.charAt(3) + word.charAt(2) + word.charAt(1));
        String word2 = ""+word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);

        System.out.println("word=" + word);
        System.out.println("word2=" + word2);


    }
}
