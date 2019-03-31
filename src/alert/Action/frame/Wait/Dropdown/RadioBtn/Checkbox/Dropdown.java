package alert.Action.frame.Wait.Dropdown.RadioBtn.Checkbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.navigate().to("http://the-internet.herokuapp.com/dropdown");
		//WebElement x = driver.findElement(By.xpath(".//*[@id='dropdown']"));
		driver.navigate().to("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		WebElement list = driver.findElement(By.xpath("//*[@name='dropdown']")); 
		
		//creating Object of Select Class and passing webElement
		Select sel=new Select(list);
		//sel.selectByIndex(2);
		//sel.selectByVisibleText("QTP");
		sel.selectByValue("ddqtp");
	}

}
