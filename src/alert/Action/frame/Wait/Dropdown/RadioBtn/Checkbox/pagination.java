package alert.Action.frame.Wait.Dropdown.RadioBtn.Checkbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class pagination {
	WebDriver driver;
	@BeforeMethod
	public void satrtup() {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");	
		
		driver = new ChromeDriver(); //launch chrome
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.dice.com/");
	}
	
	@Test
	
	public void pagination() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='search-field-keyword']")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id='search-form']/fieldset/div[4]/div/div[1]/button")).click();

		WebElement Paging_Element = driver.findElement(By.xpath("//*[@id='dice_paging_top']")); //====> Element Under which all links present.

		List<WebElement> sub_links = Paging_Element.findElements(By.tagName("a")); //==> List that hold all buttons present under paging_Element
		System.out.println("Total Paging Elements Are -- > " + sub_links.size());

		if(sub_links.size()>0){
		System.out.println("Link Is Present");

		for (int i = 2;i<sub_links.size();i++){
	
		driver.findElement(By.xpath("//*[@id='dice_paging_top']/ul/li['"+i+"']/a")).click();
		Thread.sleep(5000);;

		}

	}
	
}}
