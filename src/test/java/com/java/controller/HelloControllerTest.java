package com.java.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class HelloControllerTest {
	
	 private HelloController greetController=new HelloController();
	    
	  @Test
	  public void display() {
		String name="Rohini";
		String expectedResult="Hello "+name+"!!";
		String actualResult=greetController.displayName(name);
		assertThat(expectedResult).isEqualTo(actualResult);
	}		
}
