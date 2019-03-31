package com.WebElement;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class cookieHandle {
	
	WebDriver driver;
	@BeforeMethod()
	
	public void setup() {
		driver=new FirefoxDriver();
		driver.navigate().to("https://pushcrew.com/admin/index.php");
		driver.findElement(By.id("email")).sendKeys("testingqa@gmail.com");							
	    driver.findElement(By.id("password")).sendKeys("yw7vU43c6NvhDd9");							
	    driver.findElement(By.className("btn")).click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test()
	
	public void test() {

		Set<Cookie> cook = driver.manage().getCookies();
		System.out.println(""+cook.toString());
		Cookie maincookies = driver.manage().getCookieNamed("pushcrew_main");
		System.out.println(maincookies.getDomain());
		System.out.println(maincookies.getValue());
		System.out.println(maincookies.getDomain());
		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		driver.manage().addCookie(maincookies);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod()
	
	public void tearDown() {
		
	}

}
