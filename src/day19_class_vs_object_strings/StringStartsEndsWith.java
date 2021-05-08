package day19_class_vs_object_strings;

import java.util.Scanner;

public class StringStartsEndsWith {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String url= scan.next();
        if( url.endsWith(".com")){
            System.out.println("Commercial website");

        }else if(url.endsWith(".ru")){
            System.out.println("its Russian websie");
        }else if(url.endsWith(".gov")){
            System.out.println("Government website");
        }
    }
}