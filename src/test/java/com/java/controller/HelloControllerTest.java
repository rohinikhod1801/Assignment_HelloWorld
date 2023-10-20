package com.java.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class HelloControllerTest {
	
	 private HelloController controller= new HelloController();
	 
	  @Test
	  public void displayName() {
		  
		String passName = "Yogesh";
		String expectedName="Hello "+passName+"!!";
		String actualResult=controller.displayName(passName);
		assertThat(expectedName).isEqualTo(actualResult);	
	} 
	  
	  @Test
	  public void displayHello() {
		  
		String expectedHello="Hello World!!";
		String actualResult=controller.displayName(null);
		assertThat(expectedHello).isEqualTo(actualResult);
	 }
}
