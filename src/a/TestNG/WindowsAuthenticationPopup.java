package a.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsAuthenticationPopup {

	public static void main(String[] args) throws InterruptedException {
		
	
	 WebDriver driver=new FirefoxDriver();
	 
	    driver.get("https://www.engprod-charter.net/");
	    driver.navigate().to("https://www.engprod-charter.net/");
	    //Thread.sleep(2000);
	
	    driver.switchTo().alert().sendKeys(("username" + Keys.TAB + "password"));
	    //Thread.sleep(2000);
			//time.sleep(3)
			driver.switchTo().alert().accept();
}}
