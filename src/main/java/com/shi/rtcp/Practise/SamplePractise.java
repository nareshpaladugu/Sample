package com.shi.rtcp.Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SamplePractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\npaladu\\workspace\\Real_Time_Competitor_Pricing\\chromedriver.exe");
		WebDriver myd = new ChromeDriver();
           myd.get("https://www.facebook.com/");
	}

}
