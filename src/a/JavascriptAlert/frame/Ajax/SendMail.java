package a.JavascriptAlert.frame.Ajax;

import java.util.Properties;
//EMAIL YOUR FAILING SELENIUM WEBDRIVER SCRIPTS� STACK TRACE TO YOUR EMAIL ID
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
//import org.apache.commons.lang3.exception.ExceptionUtils;

public class SendMail{
public SendMail(String fromMail,String tomail, Exception e )
{
Properties props = new Properties();
props.put("mail.smtp.host", "smtp.gmail.com");
props.put("mail.smtp.socketFactory.port", "465");
props.put("mail.smtp.socketFactory.class",
"javax.net.ssl.SSLSocketFactory");
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.port", "465");
Session session = Session.getDefaultInstance(props,
new javax.mail.Authenticator() {
protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication("Email_Id","password");
}
});
try {
Message message = new MimeMessage(session);
message.setFrom(new InternetAddress(fromMail));
message.setRecipients(Message.RecipientType.TO,
InternetAddress.parse(tomail));
message.setSubject("Script failed");
//message.setText("your test has failed for script name:Name of your scipt <============================>"+ ExceptionUtils.getStackTrace(e) );
Transport.send(message);
System.out.println("Done");
} catch (MessagingException ex) {
throw new RuntimeException(ex);
}
}
}