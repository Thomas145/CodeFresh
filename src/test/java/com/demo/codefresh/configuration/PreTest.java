package com.demo.codefresh.configuration;

import org.springframework.boot.test.context.SpringBootTest;

import com.demo.codefresh.starter.Application;

@SpringBootTest( classes = Application.class )
public abstract class PreTest {

	public abstract void setUp();
	public abstract void tearDown();
	
}
