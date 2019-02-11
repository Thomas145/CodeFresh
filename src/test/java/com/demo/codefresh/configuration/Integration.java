package com.demo.codefresh.configuration;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class Integration extends PreTest {

	@Before
	public void setUp() {
		
	}

	@After
	public void tearDown() {
		
	}

	@Test
	public void buildTest() {
		
		assertTrue( true );
		
	}
	
}
