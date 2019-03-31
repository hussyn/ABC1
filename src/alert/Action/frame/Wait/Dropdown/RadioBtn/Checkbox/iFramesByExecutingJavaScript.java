package alert.Action.frame.Wait.Dropdown.RadioBtn.Checkbox;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iFramesByExecutingJavaScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		 driver.get("http://toolsqa.com/iframe-practice-page/");
		 
		 //By executing a java script
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 Integer numberOfFrames  = (Integer) js.executeScript(("return window.length").toString());
		 
		 System.out.println("Number of iframes on the page are " + numberOfFrames);
		 

	}

}
