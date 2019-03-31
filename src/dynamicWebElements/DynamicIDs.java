package dynamicWebElements;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
 
public class DynamicIDs {
 WebDriver driver;
 
@BeforeMethod
 public void invokeBrowser() {
 driver = new FirefoxDriver();
 driver.get("http://www.oyepages.com");
 
}
 
@AfterMethod
 public void closebrowser() {
 driver.close();
 }
 
@Test
 public void firstTest() {
 WebElement fname = driver.findElement(By
 .cssSelector("input[id^='YumRegistrationForm']"));
 fname.sendKeys("Selenium");
 }
 
@Test
 public void secondTest() {
 WebElement fname = driver.findElement(By
 .cssSelector("input[id*='RegistrationForm_first']"));
 fname.sendKeys("Bix");
 }
 
@Test
 public void thirdTest() {
 WebElement fname = driver.findElement(By
 .cssSelector("input[id$='firstname']"));
 fname.sendKeys("Merilla");
 }
}
//The above script will open the Oyepages.com registration page and enter the first name three times.

 