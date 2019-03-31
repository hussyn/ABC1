package alert.Action.frame.Wait.Dropdown.RadioBtn.Checkbox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	
	 public TestBase() {
		 
		 prop = new Properties();
		 
		 try {
			
			FileInputStream fis=new FileInputStream(new File(System.getProperty("C:\\Users\\sajjad\\eclipse-workspace\\ABC\\src\\alert\\Action\\frame\\Wait\\Dropdown\\RadioBtn\\Checkbox\\Base\\config.properties")));
		System.out.println(fis);
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} }
		 
	
		public static void initialization(){	 

		String broserName = prop.getProperty("browser");
		System.out.println(broserName);
		if(broserName.equals("chrome")) {
			
			System.setProperty("webdriver.crome.driver", "C:/cromedriver.exe");
			driver=new ChromeDriver();
		}
		
	}	
		 
	public static void main(String[] args) {
		TestBase.initialization();
	}	 
	 
}
