package com.comcast.sample;

import org.openqa.selenium.By;

public class LoginPage extends basePageClass {
	
	public void loginAttempt(String username,String password) {
		
		myD.findElement(By.id("txtUsername")).sendKeys("username");
		myD.findElement(By.id("txtPassword")).sendKeys("password");
		myD.findElement(By.id("btnLogin")).click();
	}
	
	public void forgotPassword(String currentPasswrod,String newPassword) {
		
		
		
	}

}
