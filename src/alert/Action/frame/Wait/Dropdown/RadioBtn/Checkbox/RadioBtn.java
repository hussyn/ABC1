package alert.Action.frame.Wait.Dropdown.RadioBtn.Checkbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioBtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("http://demo.guru99.com/test/radio.html");
		WebElement RadioBtn=driver.findElement(By.xpath(".//*[@id='vfb-7-3']"));
		boolean RadioBtnenabled = RadioBtn.isSelected();
		if(RadioBtnenabled==false) {
			RadioBtn.click();
			System.out.println("click Option 3");
		} 
	}

}
