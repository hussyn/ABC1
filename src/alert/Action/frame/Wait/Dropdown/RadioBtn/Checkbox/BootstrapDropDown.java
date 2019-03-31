package alert.Action.frame.Wait.Dropdown.RadioBtn.Checkbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class BootstrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//driver.navigate().to("file:///E:/HTML%20Wireframe/New%20Folder/Bootstrapdropdownmukesh.html#");
		driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class=\"dropdown-menu\"]//li/a"));
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i).getAttribute("innerHTML"));
			
			if(list.get(i).getAttribute("innerHTML").contentEquals("JavaScript")) 
			{
				list.get(i).click();
				System.out.println("click JavaScript");
			
			}
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.navigate().refresh();
//get title of the page
			String actual = driver.getTitle();
			System.out.println(actual);
			//Assert.assertEquals(actual, "http://learn-automation.com/", "pass");	
			//System.out.println("outerHTML"+list.get(i).getAttribute("outerHTML"));
		}
	}

}
