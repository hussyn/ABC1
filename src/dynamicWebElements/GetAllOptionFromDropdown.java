package dynamicWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GetAllOptionFromDropdown {

	public static void main(String[] args) {
		WebDriver driver = null;
		
		Select select=new Select(driver.findElement(By.id("")));
		List<WebElement> x = select.getOptions();//getOptions() is a method of Select class which will return List of WebElement then we can iterate using for loop or iterator and using getText() method we can extract values.

	}

}
