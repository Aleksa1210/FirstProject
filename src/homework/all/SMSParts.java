package homework.all;

public class SMSParts {
    public static void main(String[] args) {

        String msg = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}";

        int senderStart = msg.indexOf('<');
        int senderEnd = msg.indexOf('>');

        int numberStart = msg.indexOf('[');
        int numberEnd = msg.indexOf(']');

        int msgStart = msg.indexOf('{');
        int msgEnd = msg.indexOf('}');


        System.out.println("Sender " + msg.substring(senderStart + 1, senderEnd)); // +1 started not with < after +1 started with J.
        System.out.println("Number: " + msg.substring(numberStart + 1,numberEnd)); // +1 remove [, start after [
        System.out.println("Message: " + msg.substring(msgStart +2,msgEnd)); // remove {"






















    }
}
