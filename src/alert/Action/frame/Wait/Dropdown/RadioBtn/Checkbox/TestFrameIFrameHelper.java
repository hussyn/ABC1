package alert.Action.frame.Wait.Dropdown.RadioBtn.Checkbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFrameIFrameHelper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.navigate().to("https://the-internet.herokuapp.com/context_menu");
		driver.navigate().to("https://the-internet.herokuapp.com/context_menu");
	}

}
