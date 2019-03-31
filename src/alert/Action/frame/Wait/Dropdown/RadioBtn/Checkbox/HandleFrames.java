package alert.Action.frame.Wait.Dropdown.RadioBtn.Checkbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://classic.crmpro.com");
		
		driver.findElement(By.xpath(".//*[@name='username']")).sendKeys("samrizriz123");
		driver.findElement(By.xpath(".//*[@name='password']")).sendKeys("samrizriz123");
		driver.findElement(By.xpath(".//*[@value='Login']")).click();
		//total number of iframes present inside the page using the tagname 'iframe'.
		 //int index = driver.findElements(By.tagName("iframe")).size();
		// int index = driver.findElements(By.tagName("frame")).size();
		
		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath(".//a[contains(text(),'Contacts')]")).click();
	}

}
