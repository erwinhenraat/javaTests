package com.erwinhenraat;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by e.henraat on 22-4-2016.
 */
public class Mailer {
    public void sendMailTo(String adressTo, String adressFrom, String subject, String bodyText)
    {
        //Get system properties
        Properties properties = System.getProperties();
        //setup mailserver
        properties.setProperty("mail.smtp.host", "localhost");
        //Get default session object
        Session session = Session.getDefaultInstance(properties);

        try
        {
            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(adressFrom));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(adressTo));
            message.setSubject(subject);
            message.setText(bodyText);

            //send the message
            Transport.send(message);
            System.out.println("message is sent");

        }
        catch (MessagingException me)
        {
            System.out.println(me.toString() + " _____ " + me.getCause());

        }

    }

}
