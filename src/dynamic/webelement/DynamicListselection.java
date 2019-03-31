package dynamic.webelement;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
 
public class DynamicListselection {

	 @Test
	 public static void captureScreenMethod() throws Exception{
	 System.setProperty("webdriver.chrome.driver","D://Selenium Environment//Drivers//chromedriver.exe");
	 //WebDriver driver = new ChromeDriver();
	 WebDriver driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
	 driver.navigate().refresh();
	 //Once you got the select object initialised then you can access all the methods of select class. 
	 //Identify the select HTML element:
	 Thread.sleep(10000);
	 WebElement mySelectElement = driver.findElement(By.name("multipleselect[]"));
	 Select dropdown= new Select(mySelectElement);
	 List<WebElement> options = dropdown.getOptions();
	 for (WebElement option : options) {
		 if(option.getText()=="QTP") {
			 option.click();
	 System.out.println(option.getText()); //output "Selenium", "QTP", "Manual Testing", "Automation Testing", "Performance Testing"*/ 
	 }
	 }
	}
}