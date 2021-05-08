package day23_string_manipulation_while_loops;

public class SMSMessage {
    /*String message = "Sender: [Nadir] From Number<2223334444> Message:{Hello, lets code some java}";
You do not have permission to send messages in this channel.
*/
    public static void main(String[] args) {
        String message = "Sender [Nadir] From <(234)567-889> Message: {Hello, lets code some java}";
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring( start +1, end));
        String sender = message.substring(start, end);
        System.out.println("sender =" + sender);
        String mobile = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println("mobile = " + mobile);
        String text = message.substring(message.indexOf("{"),message.indexOf("}"));
        System.out.println("text = " + text);


    }
}
