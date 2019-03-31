package a.JavascriptAlert.frame.Ajax;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PopupsHandling {
	
	WebDriver driver=new FirefoxDriver();
	@Test
	
	public void PopupAlert() throws InterruptedException {
		driver.navigate().to("file:///E:/program_Feb/prompt.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/fieldset/button")).click();
		
/**/  http://www.abodeqa.com/wp-content/uploads/2016/05/DemoSite.html
		driver.switchTo().alert().sendKeys("najam");
		 String x = driver.switchTo().alert().getText();
		System.out.println(x);
		//Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, 9000);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
	}

}
