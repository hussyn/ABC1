package alert.Action.frame.Wait.Dropdown.RadioBtn.Checkbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class JavaScriptRandomDemo {
  @Test
  public void javaScriptRandomDemo()throws InterruptedException {
   
   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
   
   WebDriver driver = new ChromeDriver();
 
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
   driver.get("http://www.inviul.com");
   
   driver.manage().window().maximize();
   Thread.sleep(3000);
   
   //Javascript command
   JavascriptExecutor js = (JavascriptExecutor)driver;
   js.executeScript("document.getElementById('s').value='Avinash Mishra';");
   	  
   Thread.sleep(5000);
   
   driver.close();
   
   driver.quit();
 
 
  }
}