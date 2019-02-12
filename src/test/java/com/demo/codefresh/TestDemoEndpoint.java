package com.demo.codefresh;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.codefresh.configuration.PreTest;
import com.demo.codefresh.configuration.WebTest;

@RunWith(SpringRunner.class)
public class TestDemoEndpoint extends WebTest {

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
