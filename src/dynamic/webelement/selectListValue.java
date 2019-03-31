package dynamic.webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selectListValue {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
/*		driver.get("https://www.makemytrip.com/");
		

		driver.findElement(By.xpath(".//*[@id='hp-widget__sfrom']")).clear();
		driver.findElement(By.xpath(".//*[@id='hp-widget__sfrom']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='ui-menu-item'][2]/div/p[1]/span[1]"))).click();
*/		
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.get("https://www.makemytrip.com/");
     /*   WebElement from =  wait.until(ExpectedConditions.elementToBeClickable(By.id("hp-widget__sfrom")));
        from.click();
        from.clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul[class*='ui-widget-content hp-widget__sfrom']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(@aria-label,'Top Cities : Mumbai, India ')]"))).click();
*/		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='input_fromto checkSpecialCharacters ui-autocomplete-input' and @id='hp-widget__sfrom']"))).click();
		List<WebElement> myList = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='ui-menu-item'][starts-with(@id,'ui-id-')]//span[@class='autoCompleteItem__label']")));
		for (WebElement element:myList)
		
		    if(element.getText().contains("Mumbai"));
		        element.click();
	}

}
