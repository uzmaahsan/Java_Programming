package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun ";
        String[] word = sentence.split(" ");
        System.out.println("1st word = "+ word[0]);
        System.out.println("2nd word = " + word[1]);
        System.out.println("3rd word = " + word[2]);
        for(String w : word){
            System.out.println(w);
        }

    }
}
