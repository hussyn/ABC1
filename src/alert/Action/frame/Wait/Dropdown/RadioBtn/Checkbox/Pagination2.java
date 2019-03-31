package alert.Action.frame.Wait.Dropdown.RadioBtn.Checkbox;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pagination2 {
	
public static void main(String[] args) throws InterruptedException {
				WebDriver driver;
				System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");	
			
				driver = new ChromeDriver(); //launch chrome
	
			 	driver.manage().window().maximize();
	    		//dynamic wait
	    		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	            driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
	    
	    
	    //Test to display how to read html table using webdriver on cricinfo.com.  

	 List<WebElement> pagination = driver.findElements(By.xpath(".//div[@class='col-md-6 text-center']//a"));
	 //List<WebElement> pagination1 = driver.findElements(By.tagName("a"));
	 //System.out.println("noof link:"+pagination1.size()); 
	// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//List pagination =driver.findElements(By.xpath("//div[@class='pagination cm-pagination-wraper center']//a")); 
	int size= pagination.size(); 
	System.out.println(pagination.size()); 
	JavascriptExecutor js= (JavascriptExecutor) driver;
	//js.executeScript("arguments[0].scrollIntoView(true);",pagination);
	//js.executeScript("window.scrollTo(0,500)",pagination);
	 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	if(size>0) { 
	System.out.println("pagination exists");
	// click on pagination link
	    for(int i=0; i<size; i++){ 
	    	boolean flag = pagination.get(i).isDisplayed();	
	    	System.out.println(flag);
	    	if(flag==true) {
	    		System.out.println("inside loop flag:"+flag);
	    		pagination.get(i).click();	
	    	}
	   System.out.println(pagination.get(i).getAttribute("class"));    
	//driver.findElement(By.xpath(".//div[@class='col-md-6 text-center']//a["+i+"]")).click() ;
	Thread.sleep(5000); 
	System.out.println("Loop "+i);
	}	
	}
}
}
