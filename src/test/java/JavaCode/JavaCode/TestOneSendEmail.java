package JavaCode.JavaCode;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.testng.annotations.Test;


@Test
public class TestOneSendEmail {

	
		
		/**
		    * Utility method to send simple HTML email
		    * @param session
		    * @param toEmail
		    * @param subject
		    * @param body
		    */
		   public static void sendEmail(Session session, String toEmail, String subject, String body){
		       try
		       {
		         MimeMessage msg = new MimeMessage(session);
		         //set message headers
		         msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
		         msg.addHeader("format", "flowed");
		         msg.addHeader("Content-Transfer-Encoding", "8bit");

		         msg.setFrom(new InternetAddress("pradeep.pintu@gmail.com", "Selenium-Report"));

		         msg.setReplyTo(InternetAddress.parse("ssdas83@gmail.com", false));

		         msg.setSubject(subject, "UTF-8");

		         msg.setText(body, "UTF-8");

		         msg.setSentDate(new Date());

		         msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
		         System.out.println("Message is ready");
		         Transport.send(msg);  

		         System.out.println("EMail Sent Successfully!!");
		       }
		       catch (Exception e) {
		         e.printStackTrace();
		       }
		   }

		   public static void sendEmailNow() {
		       final String fromEmail = "pradeep.pintu@gmail.com"; //requires valid gmail id
		       final String password = "123_waverock"; // correct password for gmail id
		       final String toEmail = "pradeep.pintu@gmail.com, ssdas83@gmail.com"; // can be any email id

		       System.out.println("TLSEmail Start");
		       Properties props = new Properties();
		       props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
		       props.put("mail.smtp.port", "587"); //TLS Port
		       props.put("mail.smtp.auth", "true"); //enable authentication
		       props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS

		               //create Authenticator object to pass in Session.getInstance argument
		       Authenticator auth = new Authenticator() {
		           //override the getPasswordAuthentication method
		           protected PasswordAuthentication getPasswordAuthentication() {
		               return new PasswordAuthentication(fromEmail, password);
		           }
		       };
		       Session session = Session.getInstance(props, auth);

		       TestOneSendEmail.sendEmail(session, toEmail,"TEST Execution Report", "TESTNG REPORT");

		   }
		
	}



	


