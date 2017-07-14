package com.comcast.sample;

import org.openqa.selenium.By;

public class HomePage extends basePageClass{
	
	public void gotoSkillsPage() {
		myD.findElement(By.id("menu_admin_viewAdminModule")).click();
	}

}
