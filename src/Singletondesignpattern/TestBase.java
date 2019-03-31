package Singletondesignpattern;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	 // Create the Global Objects
	 public static Logger APPLICATION_LOGS = null;
	 public static Properties CONFIG = null;
	 public WebDriver driver = null;
	 
	 // Initialize Configuration
	 public void initConfig() {
	 APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
	 CONFIG = new Properties();
	 try {
	 FileInputStream input = new FileInputStream(
	 Constants.PROPERTIES_FILE_PATH);
	 // load a properties file
	 CONFIG.load(input);
	 } catch (Exception e) {
	 e.printStackTrace();
	 APPLICATION_LOGS.debug("Error", e);
	 }
	 }
	 
	 // To initialize the Driver
	 public void initBrowser() {
	 if (driver == null) {
	 if (CONFIG.getProperty("browser").equalsIgnoreCase("Mozilla"))
	 driver = new FirefoxDriver();
	 else if (CONFIG.getProperty("browser").equalsIgnoreCase("IE"))
	 driver = new InternetExplorerDriver();
	 else if (CONFIG.getProperty("browser").equalsIgnoreCase("Chrome"))
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 APPLICATION_LOGS.info("Browser Initialized");
	 } else {
	 APPLICATION_LOGS.debug("Instance was avaiable");
	 }
	 }
	 
	 public void invokeApplication() {
	 driver.get("https://www.facebook.com");
	 }
	 
	 public void closeBrowser() {
	 driver.close();
	 APPLICATION_LOGS.info("Browser Closed");
	 }
	 
	 public void quitDriver() {
	 driver.quit();
	 APPLICATION_LOGS.info("All Browser Instance are closed");
	 }
	 
	 @BeforeTest
	 public void init() {
	 initConfig();
	 initBrowser();
	 invokeApplication();
	 }
	 
	 @AfterTest
	 public void tearDown() {
	 closeBrowser();
	 }
	}