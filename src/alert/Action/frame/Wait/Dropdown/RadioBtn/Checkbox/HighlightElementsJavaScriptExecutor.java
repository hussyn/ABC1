package alert.Action.frame.Wait.Dropdown.RadioBtn.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HighlightElementsJavaScriptExecutor {

	private static final String Browser = null;
	private static final String crome = null;
	private static final String Firefox = null;
	private static final String ie = null;

	public static void main(String[] args) {
		
		WebDriver driver = null;
		
		

		System.setProperty("webdriver.crome.driver", "C:/chromedriver.exe");
		//driver.navigate().to("http://www.inviul.com");
		driver.get("https://www.freecrm.com"); //enter URL
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@1234");
		//driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		
		//executeScript -- to execute JavaScript code
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]")); //logi
		}
		

		
	
       
}
