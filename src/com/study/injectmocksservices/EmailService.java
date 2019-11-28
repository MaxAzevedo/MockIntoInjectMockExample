package com.study.injectmocksservices;

public class EmailService implements Service {

	@Override
	public boolean send(String msg) {
		return true;
	}
	
}
