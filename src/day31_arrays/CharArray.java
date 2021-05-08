package day31_arrays;

public class CharArray {

    public static void main(String[] args) {
        char[] letters  ={ 'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        for(char each : letters){
            System.out.print(each + " ");

        }
        String sentences = new String (letters);
        System.out.println("\nsentence = " + sentences);
        String item = "WOODEN SPOON";
        char [] itemArray = item.toCharArray();
        System.out.println("item Array.length" + itemArray.length);
        System.out.println("item.length() = " + item.length());

        String[] fruits = {"bananas" , "apples", "kiwi", "mango", "papaya", "strawberry"};
        for(String each : fruits){
            System.out.println(each + "-");
        }
        String[] languages = {"java", "python" , "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join("",languages));
        System.out.println(String.join("##",languages));
        String joinedLanguages = String.join(" <> " , languages);
        System.out.println("joinedLanguages = " + joinedLanguages);


        }

    }

