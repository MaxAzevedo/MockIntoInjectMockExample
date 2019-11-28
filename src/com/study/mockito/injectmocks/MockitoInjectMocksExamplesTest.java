package com.study.mockito.injectmocks;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;

import com.study.injectmocksservices.AppService;
import com.study.injectmocksservices.EmailService;

import static org.junit.jupiter.api.Assertions.*;

public class MockitoInjectMocksExamplesTest extends BaseTestCase{
	
	@Mock EmailService emailService;
	
	@InjectMocks AppService appServicesConstructorInjectionMock;
	
	@Test
	public void testConstructorInjectionMock() {
		//Here we are mocking the return of the "sendEmail" method.
		when(appServicesConstructorInjectionMock.sendEmail("Email")).thenReturn(true);
		
		assertTrue(appServicesConstructorInjectionMock.sendEmail("Email"));
		assertFalse(appServicesConstructorInjectionMock.sendEmail("Unstubbed Email"));
		
	}


}
