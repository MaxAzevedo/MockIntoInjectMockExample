package com.study.injectmocksservices;

public class AppService {
	
	private EmailService emailService;

	public AppService(EmailService emailService) {
		this.emailService = emailService;
	}

	public boolean sendEmail(String msg) {
		return emailService.send(msg);
	}

}
