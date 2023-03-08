package JavaCode.JavaCode;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {

	public static void main(String[] args) throws EmailException {
		
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator("pradeep.pintu@gmail.com", "123_waverock"));
		email.setSSLOnConnect(true);
		
		email.setFrom("pradeep.pintu@gmail.com");
		email.setSubject("Test Results");
		email.setMsg("Test Report for Testcase1 :-)");
		email.addTo("pradeep.pintu@gmail.com");
		email.send();

	}

}
