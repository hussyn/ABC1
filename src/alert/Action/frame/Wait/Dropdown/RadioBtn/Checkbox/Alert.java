package alert.Action.frame.Wait.Dropdown.RadioBtn.Checkbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alert {
	public static WebDriver driver;
	@BeforeMethod
	public void startup() {
		
		  driver=new FirefoxDriver();
		  //set implicit wait for 10 sec
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.navigate().to("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
	}

	@Test
	
	public static void SimpleAlert(WebElement element) {
   
		Alert alert=new Alert();
		driver.switchTo().alert().accept();
		 	 
	}
	@Test
	public void Confirmationalert() throws InterruptedException{
	
		
	}
	
	@Test
	public void Promptalert() {
		
	}
	
	@Test
	public void JavaScriptExcutor() {
		//Creating the JavascriptExecutor interface object by Type casting 
		JavascriptExecutor js= (JavascriptExecutor) driver;//Type mismatch: cannot convert from WebDriver to JavascriptExecutor
		//js.executeScript(arg0, arg1)
		
		
        //Uncomment each scenario by using Ctrl + Shift + \ (backslash) and find the solution

        //to type text in Selenium WebDriver without using sendKeys() method
        js.executeScript("document.getElementById('some id').value='someValue';");
        js.executeScript("document.getElementById('Email').value='SoftwareTestingMaterial.com';");
        
    
}
}
