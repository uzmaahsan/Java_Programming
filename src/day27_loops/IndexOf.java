package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'i';
        int index = -1;// default value
        for(int i =0; i< word.length(); i++){
           // System.out.println(i + "-" + word.charAt(i));
            if(word.charAt(i)== letter){
                index = i;
                System.out.println(letter + " is found at index " + index);
            }
        }
    }
}
