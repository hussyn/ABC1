package alert.Action.frame.Wait.Dropdown.RadioBtn.Checkbox;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReadingTableExample {
    private WebDriver driver;
    private String baseUrl="http://www.espncricinfo.com/";
    @BeforeClass
    public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver(); //launch chrome
            //driver = new FirefoxDriver();
		driver.manage().window().maximize();
    		//dynamic wait
    		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get(baseUrl);
    }
    //Test to display how to read html table using webdriver on cricinfo.com.  
    @Test
    public void printFacebookFriendList() throws Exception {
    	WebElement ele = driver.findElement(By.xpath("//*[contains(text(),'Scorecard')]"));
            //Get all the links for Scorecard. 
    		JavascriptExecutor js=(JavascriptExecutor) driver;
    		js.executeScript("arguments[0].scrollIntoView()", ele);
    	  List<WebElement> box = driver.findElements(By.xpath("//*[contains(text(),'Scorecard')]"));
    	  System.out.println(box.size());
            //Click on the first scorecard link from News Section
           // (scorecard.get(0)).click();
            (box.get(0)).click();
            //Get all the data of the table
            WebElement table =driver.findElement(By.id("inningsBat1"));
              
            List<WebElement> rows = table.findElements(By.tagName("tr"));
            Iterator<WebElement> i = rows.iterator();
            //Print the table. 
            while(i.hasNext()) {
                    WebElement row = i.next();
                    List<WebElement> columns = row.findElements(By.tagName("td"));
                    Iterator<WebElement> j = columns.iterator();
                    while(j.hasNext()) {
                            WebElement column = j.next();
                            //Removing blank columns data and add a separator while displaying data.
                            if (!column.getText().trim().equals("")){
                                    System.out.print(column.getText());
                                    System.out.print(" | ");
                            }
                    }
                    System.out.println("");
                    System.out.println("-----------------------------------------------");
            } 
    }
    @AfterClass
    public void tearDown() throws Exception {
           // driver.quit();
    }
}