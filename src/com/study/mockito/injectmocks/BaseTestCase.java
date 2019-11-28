package com.study.mockito.injectmocks;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;

public class BaseTestCase {
	
	@BeforeEach
	void initMocks() {
		MockitoAnnotations.initMocks(this);
	}

}
