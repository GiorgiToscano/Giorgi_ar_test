package com.model.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;


public class EmailManager {
	
	@Autowired
	private JavaMailSenderImpl mailSender;
	
//	static {
//	    mailSender.setHost("smtp.gmail.com");
//	    mailSender.setPort(587);
//	     
//	    mailSender.setUsername("areariservata@iisgiorgimilano.gov.it");
//	    mailSender.setPassword("giorgiareariservata_2016");
//	     
//	    Properties props = mailSender.getJavaMailProperties();
//	    props.put("mail.transport.protocol", "smtp");
//	    props.put("mail.smtp.auth", "true");
//	    props.put("mail.smtp.starttls.enable", "true");
//	    props.put("mail.debug", "true");
//	}
	
	public void sendEmail(Email mail) {
		mailSender.send(mail.getMail());
	}
	
	public JavaMailSenderImpl getMailSender() {
		return mailSender;
	}

}
