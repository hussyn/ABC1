package CollectionInSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class multipleWindowhandle {
	
	WebDriver driver;
	@BeforeMethod()
	public void setup() {
		driver=new FirefoxDriver();
		driver.navigate().to("http://www.naukri.com/");
	}
	
	@Test()
	public void mulWindowhandle() {
		
		String parentwindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> itr = handles.iterator();
		
		while(itr.hasNext()) {
			String childwindows = itr.next();
			System.out.println(childwindows);
		
		}
		
	}
	

	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

}
