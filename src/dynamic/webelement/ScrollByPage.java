package dynamic.webelement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollByPage {

    WebDriver driver;
    @Test
    public void ByPage() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application		
        driver.get("http://demo.guru99.com/test/guru99home/");

        //This will scroll the web page till end.		
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
       /* Script Description : In the above code, we first launch the given url in Chrome browser. Next, scroll till the bottom of the page. Javascript method scrollTo() scroll the till the end of the page .

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");		
        "document.body.scrollHeight" returns the complete height of the body i.e web page
*/    }
}