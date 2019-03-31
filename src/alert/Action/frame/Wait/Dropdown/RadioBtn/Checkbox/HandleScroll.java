package alert.Action.frame.Wait.Dropdown.RadioBtn.Checkbox;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleScroll {
public static void main(String[] args) {
	WebDriver driver= new FirefoxDriver();			
	
    //Creating the JavascriptExecutor interface object by Type casting		
    JavascriptExecutor js = (JavascriptExecutor)driver;		
    		
    //Launching the Site.		
    driver.get("http://moneyboats.com/");			
 
    //Maximize window		
    driver.manage().window().maximize();		
    		
    //Vertical scroll down by 600  pixels(horizontal and vertical)	

    js.executeScript("window.scrollBy(0,600)");
}
}
