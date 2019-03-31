package a.JavascriptAlert.frame.Ajax;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultipleWindows {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		driver= new FirefoxDriver();
		driver.navigate().to("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();//How it works=The WebDriver class provides the window interface for setting up the browser window size, state etc.When we call the maximize() method, the browser window will be maximized from normal or minimized state.
		//driver.manage().window().fullscreen();
		driver.findElement(By.linkText("Click Here")).click();
		//driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		String mainwindow = driver.getWindowHandle();
		
		//to get all windows
		 Set<String> list = driver.getWindowHandles();
		 Iterator<String> child = list.iterator();
		 
		 while(child.hasNext()) {
			//System.out.println(childwindows.next()); 
			 String childwindow = child.next();
			if(!mainwindow.equalsIgnoreCase(childwindow)) {
				//switch to child window
				driver.switchTo().window(childwindow);
				driver.findElement(By.xpath("//*[contains(@name,'emailid')]")).sendKeys("xyz@gmail.com");
				driver.findElement(By.xpath("//*[@name='btnLogin']")).click();
				//closing the child window
				driver.close();
			}
			//switch to main window
			driver.switchTo().window(mainwindow);
		 }
		 
		 

	}

}
