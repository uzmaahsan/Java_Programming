package day29_nestedloops_arrays;

public class CountCharsNestedLoops {

        public static void main(String[] args) {
            //0123
            String word = "java";

            for (int outer = 0; outer < word.length(); outer++) {
                System.out.println("outer: " + word.charAt(outer));
                int count = 0; //reset count to 0
                for (int inner = 0; inner < word.length(); inner++) {
                    //System.out.println(word.charAt(inner));
                    if (word.charAt(outer) == word.charAt(inner)) {
                        count++;
                    }
                }
                System.out.println(word.charAt(outer) + "=" + count);
            }
        }
    }
