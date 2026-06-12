package model;
import java.util.ArrayList;

public class Notification {
    private  int notificationID;
    private String message;
    private String recipient;
    private ArrayList<String> WhatsapNums;
    private ArrayList<String> Emails;


    public Notification(int notificationID, String message, String recipient) {
        this.notificationID = notificationID;
        this.message = message;
        this.recipient = recipient;

    }

    public int getNotificationID() {
        return notificationID;
    }

    public String getMessage() {
        return message;
    }

    public String getRecipient() {
        return recipient;
    }
    public void AddNumber(String num){
        WhatsapNums.add(num);

    }
    public void AddEmail(String Emailnew){
        Emails.add(Emailnew);

    }
    // public sendWhatsappMessage(){

    // }
   
}
