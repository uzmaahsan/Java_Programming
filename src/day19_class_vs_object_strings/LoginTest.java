package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassWord = "Abc123";

        String userName = "Cybertek";
        String password = "abc123";

        if (expUserName.equalsIgnoreCase(userName) && expPassWord.equalsIgnoreCase(password)){
            System.out.println("pass - user logged in sucessfully");
        }else{
            if(!expUserName.equalsIgnoreCase( userName )){
                System.out.println("Fail -  userName is incorrect");
            }else{
                System.out.println("Fail - password is incorrect");
            }
        }
    }
}