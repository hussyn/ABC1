package a.JavascriptAlert.frame.Ajax;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DragDropTest {

	 WebDriver driver;
/*@BeforeClass()
public void setup() {
	driver = new FirefoxDriver();
}*/

@Test()
public void verifyNumberOfNavigationMenus() throws InterruptedException {
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://jqueryui.com/droppable/");
	//http://demo.guru99.com/test/drag_drop.html
	//step
/*	1) source
	2) destination
	3) Actions action = new Actions(driver);//create object of Actions class as we use methods of Actions class
	4) act.dragAndDrop(source, target).perform()//For drag and drop element we use dragAndDrop method of Actions class and passes the parameters as the first element(Sourcelocator) "From" and the second element(Destinationlocator)
	*/
    Thread.sleep(3000);
	WebElement source = driver.findElement(By.xpath(".//*[@id='draggable']"));
	
	WebElement target = driver.findElement(By.xpath(".//*[@id='droppable']"));
	Actions act=new Actions(driver);
	act.dragAndDrop(source, target).perform();
	act.moveToElement(driver.findElement(By.xpath("..//*[@id='draggable']")));
	act.keyDown(Keys.CONTROL);
	act.moveToElement(driver.findElement(By.xpath(".//*[@id]='droppable'")));
	act.keyUp(Keys.CONTROL);
	act.build().perform();
		
}

/*@AfterClass()

	public void teardown() {
	driver.close();
	}*/
}
