package day29_nestedloops_arrays;

public class Multiplications {
    public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.print(i+ " * "+j+" = "+i*j+"\t ");
                }

                System.out.println("  ");


                String word = "java";
                for(i = 0; i < word.length(); i++) {
                    for(int j = 0; j <= i; j++) {
                        System.out.print(word.charAt(j));
                    }
                    System.out.println();
                }
            }
        }
    }


