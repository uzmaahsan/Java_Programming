package day32_arrays_split;

public class ReverseSentences {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] word = sentence.split(" ");
        String reversed = "";
        for(int i =word .length-1; i >=0; i--){
           // System.out.println(word[i] + " ");
            reversed+=word[i] + " ";
        }
        System.out.println("sentence = " + sentence);
        System.out.println("reversed.trim() = " + reversed.trim());
    }
}
