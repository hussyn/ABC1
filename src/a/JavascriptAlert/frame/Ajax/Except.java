package a.JavascriptAlert.frame.Ajax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Except {
WebDriver d;
@BeforeMethod
public void launch()
{
System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
d = new ChromeDriver();
}
@Test
public void test()
{
d.get("www.gmail.com");
try{
WebElement element= d.findElement(By.xpath("//div/span"));
element.sendKeys("dwarika");
}
catch(Exception e)
{
e.printStackTrace();
new SendMail("Sender_Mailid","Receiver_Mailid",e);
}
}
}