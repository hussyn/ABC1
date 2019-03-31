package alert.Action.frame.Wait.Dropdown.RadioBtn.Checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameIFrameHelper {

/*	How To Switch To The Frame/IFrame Use Selenium WebDriver
	WebDriver’s switchTo() method return a TargetLocator object, this locator provide below method.
	Common method used in this example to verify the switch action success.*/
	
	public static int getTotalFrameCountInCurrentPage(WebDriver driver)
	{
		int ret = 0;
		
		By byFrameTag = By.tagName("frame");
		List<WebElement> frameList = driver.findElements(byFrameTag);
		int frameSize = frameList.size();
		
		System.out.println("There are " + frameSize + " frame in current web page.");
		
		By byIFrameTag = By.tagName("iframe");
		List<WebElement> iframeList = driver.findElements(byIFrameTag);
		int iframeSize = iframeList.size();
		
		System.out.println("There are " + iframeSize + " iframe in current web page.");
		
		ret = frameSize + iframeSize;
				
		return ret;
	}
	
	
/*	Switch to by index. switchTo().frame(int frameNumber)
	The frames in a web page is stored in an array started with index 0.*/
	public static void getFrameByIndex(WebDriver driver, int frameIndex)
	{
		// Switch to by index.
		driver.switchTo().frame(frameIndex);
		
		// Check whether the switch action successfully or not.
		int totalFrameCount = TestHtmlFrame.getTotalFrameCountInCurrentPage(driver);
		
		System.out.println("There are totaly " + totalFrameCount + " frames exist in current frame which index is " + frameIndex);
	}
	//Switch to by name attribute. switchTo().frame(string frameName)
	public static void getFrameByName(WebDriver driver, String frameName)
	{
		driver.switchTo().frame(frameName);
		
		int totalFrameCount = TestHtmlFrame.getTotalFrameCountInCurrentPage(driver);
		
		System.out.println("There are totaly " + totalFrameCount + " frames exist in current frame with name " + frameName);
	}
	//4 Switch to by id attribute. switchTo().frame(string frameId)
	public static void getFrameById(WebDriver driver, String frameId)
	{
		driver.switchTo().frame(frameId);
		
		int totalFrameCount = TestHtmlFrame.getTotalFrameCountInCurrentPage(driver);
		
		System.out.println("There are totaly " + totalFrameCount + " frames exist in current frame with id " + frameId);
	}
	
	
	//5 Switch to by web element. switchTo.frame(WebElement frameElement)
	//If the id or name is not exist or changed dynamically, you can use this method. You can get the frame web element via a lot of method, such as by xpath, by css selector etc.	
	public static void getFrameByXpath(WebDriver driver, String xpath)
	{
		By byXPath = By.xpath(xpath);
		
		// Get all web elements by xpath.
		List<WebElement> iframeList = driver.findElements(byXPath);
		
		if(iframeList.size()>0)
		{
			// Get the first web element.
			WebElement iframeElement1 = iframeList.get(0);
			
			// Switch to it.
			driver.switchTo().frame(iframeElement1);
			
			int totalFrameCount = TestHtmlFrame.getTotalFrameCountInCurrentPage(driver);
			
			System.out.println("There are totaly " + totalFrameCount + " frames exist in current frame with xpath " + xpath);
		}else
		{
			System.out.println("Do not find any web element with xpath " + xpath);
		}
	}
	
	/* Return back to top web page.*/
	public static void returnToTopWebPage(WebDriver driver)
	{ 
		driver.switchTo().defaultContent();
	}
	
	
	//Example To Get Child Frame In Parent

	//Now we want to get the username input text box and input text into it in pageIFrame2.html, which is located in the right down iframe. We should follow below steps.
/*	Switch to the parent frame.
	Switch to the child iframe.
	Get the input text box web element.
	Use sendKeys(String text) method to input text in it.*/
	
	public static void getChildFrameByXPath(WebDriver driver, String parentFrameXPath, String childFrameXPath)
	{
		// First switch to parent
		TestHtmlFrame.getFrameByXpath(driver, parentFrameXPath);
		
		// Then switch to child iframe in parent.
		TestHtmlFrame.getFrameByXpath(driver, childFrameXPath);
		
		// Check current web page content to verify the switch action success.
		By byUserName = By.name("userName");
		List<WebElement> eleList = driver.findElements(byUserName);
		if(eleList.size()>0)
		{
			WebElement element = eleList.get(0);
			
			element.sendKeys("dev2qa.com");
			
			System.out.println("Find web element in current child web page, parent page xpath : " + parentFrameXPath + " , child page xpath : " + childFrameXPath);
			
			System.out.println("Found web element tage : " + element.getTagName() + " , value : " + element.getText());
		}
		
	}
	
}
