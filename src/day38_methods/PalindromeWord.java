package day38_methods;
/**
 * import all static methods. so that you can just call by method name, without classname
 */
import static day38_methods.StringUtils.*;

class StringUtilTest {
    private static String Word;

    public static void main(String[] args) {
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)) {
            System.out.println("FAIL: Username cannot be null or empty");
        }

        System.out.println("isPalinrome(civic) = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome(Cybertek) = " + isPalindrome("Cybertek"));
        String word = "java";
        String revWord = StringUtils.reverse(word);
        System.out.println("Word = " + Word);
        System.out.println("revWord = " + revWord);
        System.out.println(StringUtils.reverse(revWord));
    }
}

class StringUtils {

    public static void main(String[] args) {
        System.out.println("isNullOrEmpty(\"hello\") = " + isNullOrEmpty("hello"));
        String word = null;
        //System.out.println(word.isEmpty());

        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
        word = "";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
//        if(str == null || str.isEmpty()) {
//            return true;
//        }
//        return false;
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for(int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static String reverse(String str){
        String reverse = "'";
        for(int i = str.length()-1;i>=0; i --){
            reverse+=str.charAt(i);
        }
        return str;
    }

}

