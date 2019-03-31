package alert.Action.frame.Wait.Dropdown.RadioBtn.Checkbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("http://the-internet.herokuapp.com/checkboxes");
		WebElement chkbox=driver.findElement(By.xpath(".//*[@id='checkboxes']/input[1]"));
		boolean chkboxselected = chkbox.isSelected();
		
		if(chkboxselected==false) {
			chkbox.click();
			System.out.println("chkbox clicked");
		}
	}

}
