package model;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class GmailSender {

    private static final String EMAIL_FROM = "omartharwat244@gmail.com";
    private static final String EMAIL_TO   = "omartharwat255@gmail.com";
    private static final String APP_PASSWORD = "szwd vlji pndo ahne" ;
               

    public static void sendEmail() throws Exception {
        Session session = getEmailSession();

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(EMAIL_FROM));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(EMAIL_TO));
        message.setSubject("Email subject");
        message.setText("This is my email sent from Gmail using Java");

        Transport.send(message);
        System.out.println("Email sent successfully!");
    }

    private static Session getEmailSession() {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        return Session.getInstance(props, new Authenticator() {
            @Override

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL_FROM, APP_PASSWORD);
            }
        });
    }
}