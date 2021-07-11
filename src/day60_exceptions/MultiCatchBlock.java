package day60_exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        String word = "java";
        try {
            System.out.println("word = " + word);
            System.out.println("length = " + word.length());
            System.out.println(word.substring(20));

        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught and handled, please check if String has va= " + e);
        }catch(Throwable t){
            System.out.println("exception caught");
            System.out.println("Reason = " + t.getCause());

        }
    }
}