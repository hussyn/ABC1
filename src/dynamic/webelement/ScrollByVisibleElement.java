package dynamic.webelement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ScrollByVisibleElement {
	WebDriver driver;
    @Test
    public void ByVisibleElement() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Launch the application		
        driver.get("http://demo.guru99.com/test/guru99home/");

        //Find element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.linkText("Linux"));

        //This will scroll the page till the element is found		
        //js.executeScript(arg0, arg1)
        
        js.executeScript("arguments[0].scrollIntoView();", Element);//Javascript method scrollIntoView() scrolls the page until the mentioned element is in full view :"arguments[0]" means first index of page starting at 0.Where an " Element " is the locator on the web page.
        Element.click();

    }

}
