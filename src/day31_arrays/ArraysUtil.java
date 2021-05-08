package day31_arrays;
import java.util.*;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] num ={100,9,21,5,7,0,-4,44 ,33};
        System.out.println(Arrays.toString(num));

        //sort nums

        Arrays.sort(num);
        //print after sorting
        System.out.println(Arrays.toString(num));
        System.out.println( "min value: " + num[0]);
        System.out.println("max value: " + num[num.length-1]);

        String words []= {"java" , "c#" , "c++" , "kotlin" ,"Ruby" , "Python" , "Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("[" + String.join(" ," , words) + "]");
        //sort words in alphabetic and Asscii table

        System.out.println(Arrays.toString(words));

        //sort words in reverse order
        Arrays.sort(words,Collections.reverseOrder());
        System.out.println(Arrays.toString(words));
    }
}
