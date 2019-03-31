package alert.Action.frame.Wait.Dropdown.RadioBtn.Checkbox;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pagination4 {
	
public static void main(String[] args) throws InterruptedException {
				WebDriver driver;
				System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");	
			
				driver = new ChromeDriver(); //launch chrome
	
			 	driver.manage().window().maximize();
	    		//dynamic wait
	    		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	            driver.get("file:///E:/HTML%20Wireframe/New%20Folder/New%20folder/Minimal-jQuery-Table-Pagination-Plugin-SimplePagination/index.html");
	    
	    
	    //Test to display how to read html table using webdriver on cricinfo.com.  

	 WebElement pagination_next = driver.findElement(By.xpath("//*[contains(text (),'Next')]"));////button[contains(text(),'Previous')]
	 List<WebElement> pagination_pre = driver.findElements(By.xpath("button[contains(text(),'Previous')]"));

	String entries = driver.findElement(By.xpath("html/body/div[2]/div/span")).getText();

	//System.out.println(entries);
	
	//Get number of rows In table.
	
	 //Get number of columns In table.
	if(pagination_next.isEnabled()==true)
	{
		
	aa:	
	for (int iRow=1;iRow<=57.;iRow++) {
		
			bb:
			for(int jCol=1;jCol<=6;jCol++) {
				
				String scolValue = driver.findElement(By.xpath(".//*[@id='example']/tbody/tr["+iRow+"]/td["+jCol+"]")).getText();
				//System.out.println("forcondition:="+iRow+" "+jCol); 
				
				//System.out.println(scolValue+"\t");	
				if (scolValue.contains("Jonas Alexander")) {
					System.out.println("Jonas Alexander found");
					break aa;
				}
		
				 if((iRow == 5 && jCol == 6) || (iRow == 10 && jCol == 6)|| (iRow == 15 && jCol == 6)|| (iRow == 20 && jCol == 6)|| (iRow == 25 && jCol == 6)|| (iRow == 30 && jCol == 6)|| (iRow == 35 && jCol == 6)|| (iRow == 40 && jCol == 6)|| (iRow == 45 && jCol == 6)|| (iRow == 50 && jCol == 6)|| (iRow == 55 && jCol == 6)) 
				 		{
					 pagination_next.click();
               		//System.out.println("pagination_next.click()");
                  	//System.out.println(" if condition:="+iRow+" "+jCol); 
				 		}
						//System.out.print("scolValue1="+scolValue1+"\t");
				
				}
					 
			}
			
	}



	}

}
