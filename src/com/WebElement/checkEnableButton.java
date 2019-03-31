package com.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkEnableButton {
	public static  WebDriver driver;
	public static void SignUp(String un,String email,String confirmEmail,String password) {
		
		driver.findElement(By.id(".//*[@id='name']"));
		driver.findElement(By.id(".//*[@id='email']"));
		driver.findElement(By.id(".//*[@id='confirmEmail']"));
		driver.findElement(By.id(".//*[@id='password']"));
		driver.findElement(By.id(".//input[@type='checkbox']"));
		driver.findElement(By.id(".//*[@id='patreon-normal-signup-button']"));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 driver=new FirefoxDriver();//Cannot make a static reference to the non-static field driver
		 driver.navigate().to("https://www.patreon.com/signup");//https://www.learnpick.in/join-as-tutor
		//verify Eanable button
		 

	}

}
