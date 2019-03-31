package alert.Action.frame.Wait.Dropdown.RadioBtn.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PopupsHandling {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=new FirefoxDriver();
	
    //Exception in thread "main" org.openqa.selenium.NoAlertPresentException: No alert is present 
	//(WARNING: The server did not provide any stacktrace information)
	//Command duration or timeout: 2.13 seconds
		driver.manage().window().maximize();
		driver.get("file:///E:/HTML%20Wireframe/New%20Folder/Prompt%20Popups.htm");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='promptFunction()']")).click();
		org.openqa.selenium.Alert alert=driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("Helllo");
		alert.accept();
		System.out.println(alert.getText());
	}
}