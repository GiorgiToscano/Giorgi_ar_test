package com.model.mail;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.MimeMessageHelper;

public abstract class Email {
	
	private MimeMessage emess =null;
	private Map<String,String> model = new HashMap<String,String>();
	private EmailTemplate template;
	
	
	public Email(EmailTemplate template) {
		this.template = template;
	}
	
	private void compile(String to, EmailManager manager) {
		if (manager == null) System.out.println("Manager null!");
		emess = manager.getMailSender().createMimeMessage();
		String result = template.getTemplateText();
		for (Entry<String,String> pair : model.entrySet()) {
			result = result.replace("[" + pair.getKey() + "]", pair.getValue());
		}
		try {
			MimeMessageHelper helper = new MimeMessageHelper(emess);
			helper.setSubject(template.getSubject());
			helper.setText(result,true);
			helper.setTo(to);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
	
	public void sentTo(EmailManager manager, String to) {
		compile(to,manager);
		manager.sendEmail(this);
	}
	
	public void mapParameter(String key,String value) {
		model.put(key, value);
	}
	
	public MimeMessage getMail() {
		return emess;
	}
	
	
}
