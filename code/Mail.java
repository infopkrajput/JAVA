import java.io.File;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class Mail {
	public static void main(String[] args) {
		String from = "usls01132@gmail.com";
		String pass = "zrez moum wgyj lvyv";
		String to = "incappclasscode@gmail.com";
		String sub = "Test email from java program";
		String text = "This is a java Cui based application used to send this email.";
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.ssl.enable", "true");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.port", "465");

		Session session = Session.getInstance(prop, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication(from, pass);
			}

		});
		MimeMessage msg = new MimeMessage(session);

		MimeMultipart mime = new MimeMultipart();
		MimeBodyPart body = new MimeBodyPart();
		MimeBodyPart attach = new MimeBodyPart();
		try {
			msg.setFrom(from);
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setSubject(sub);
			body.setText(text);

			File f = new File("C:\\Users\\usls0\\Downloads\\image.jpg");
			attach.attachFile(f);

			mime.addBodyPart(body);
			mime.addBodyPart(attach);
			
			msg.setContent(mime);
			Transport.send(msg);
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
