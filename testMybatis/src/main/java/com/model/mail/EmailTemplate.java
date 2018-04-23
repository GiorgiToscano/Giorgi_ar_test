package com.model.mail;

public class EmailTemplate {

	private String subject;
	private String templateText;
	
	public EmailTemplate(String subject,String htmlFile) {
		this.subject = subject;
		this.templateText = EmailUtils.textFromHTML(htmlFile);
	}
	
	public String getSubject() {
		return subject;
	}

	public String getTemplateText() {
		return templateText;
	}
}
