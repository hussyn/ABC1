package dynamicWebElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownInAscendingOrDescending {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://seleniumpractise.blogspot.com/");
		
		List actuallist=new ArrayList();
		
		List temp=new ArrayList();
		
		//Select sel=new Select(driver.findElement(By.id("tools")));
		Select sel=new Select(driver.findElement(By.id("tools1")));
		List<WebElement> list = sel.getOptions();
		
		for(WebElement li:list) {
			String x = li.getText();
			actuallist.add(x);
			System.out.println(x);
		}
		temp.addAll(actuallist);
		 Collections.sort(temp);
		System.out.println("expectedAscending list"+temp);
		
		Assert.assertTrue(actuallist.equals(temp), "ExcutionResult");
		Assert.assertEquals(actuallist, temp);
	}

}
