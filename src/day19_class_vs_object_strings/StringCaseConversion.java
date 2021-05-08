package day19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word= "word";
        String sentence="JAVA IS FUN!";
        System.out.println(word);
        String wordInLcase = word.toLowerCase();
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());
        word=word.toLowerCase();
        System.out.println("word = " + word);
        System.out.println(word);



        String passWord="abc123";
        if(passWord.length()>=6){
            System.out.println("valid amazon password");
        }else{
            System.out.println("password too short");
        }



    }
}
