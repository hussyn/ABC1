package a.TestNG;


	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;

	public class SampleTest {
	@BeforeSuite
	public void createSelenium(){
	System.out.println("Creating selenium...");
	}
	@AfterSuite
	public void destroySel() {
	System.out.println("Destroy the sel...");
	}
	@BeforeTest
	public void openConnection() {
	System.out.println("establishing the connection with db..");
	}
	@AfterTest
	public void closeConnection() {
	System.out.println("shutdown the connection with db..");
	}
	@BeforeMethod
	public void openBrowser(){
	System.out.println("Opening the browser..");
	}
	@AfterMethod
	public void closeBrowser(){
	System.out.println("Closing the browser..");
	}
	@Test
	public void testApp() {
	System.out.println("in testApp...");
	}
	@Test
	public void testLogin() {
	System.out.println("in testLogin...");
	}
	
}
