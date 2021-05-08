package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle= "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length()==0);
        if(jobTitle.isEmpty()){
            System.out.println("job title is missing , please resend");
            if(jobTitle.length()==0){

            }else{
                System.out.println(" job title is not empty ");
                String veggies ="carrots";
                System.out.println(veggies.isEmpty());
                if(!veggies.isEmpty()){
                    System.out.println("we have carrots");
                }
            }
        }
    }



}
