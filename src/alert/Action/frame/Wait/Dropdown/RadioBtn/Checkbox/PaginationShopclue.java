package alert.Action.frame.Wait.Dropdown.RadioBtn.Checkbox;

import java.util.List;
import java.io.IOException; 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class PaginationShopclue {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException { 
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://www.shopclues.com/"); 
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("html/body/footer/div[3]/div/ul[2]/li[1]"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		js.executeScript("arguments[0].click;",ele);
		//js.executeScript("arguments[0].style.border='3px dotted blue'", ele);
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//js.executeScript("window.location = 'https://www.shopclues.com/computers.html?page=3");
		//Click on Computers 
		//driver.findElement(By.xpath("//a[contains(text(),'Computers')]")).click(); 
		
		
		//Click On View All 
		driver.findElement(By.xpath("(//a[@href='computers/laptops.html' and text()=' View All'])[1]")).click();

		List pagination =driver.findElements(By.xpath("//div[@class='pagination cm-pagination-wraper center']//a")); 
		int size= pagination.size(); 
		System.out.println(pagination.size()); 
		if(size>0)
		{ 
		System.out.println("pagination exists");
		// click on pagination link
		for(int i=2; i<size; i++){ 

		try{ 
		driver.findElement(By.xpath("//div[@class='pagination cm-pagination-wraper center']//a["+i+"]")).click() ;
		Thread.sleep(5000); 
		System.out.println("Loop "+i);
		}
		catch(Exception e){ 
		e.printStackTrace(); 
		} 
		} 
		driver.quit();
		} 
		else 
		{ 
		System.out.println("pagination not exists"); 
		}
		} 

		
}
