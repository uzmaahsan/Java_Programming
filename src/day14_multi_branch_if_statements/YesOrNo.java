package day14_multi_branch_if_statements;

import java.sql.SQLOutput;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file ?");
        char selection  = 'y';
        boolean answer ;
        String result;
        if (selection == 'y') {
            System.out.println("your file will be deleted");
            System.out.println("your file will be deleted");
            answer = false;
            result = "not deleted";
        }else{


            System.out.println("file deletion cancelled");
            answer = true;
            result = "deleted";


        }
        System.out.println("did file get deleted ? -" + answer);

        System.out.println("did file get deleted ? -" + result);


    }
}
