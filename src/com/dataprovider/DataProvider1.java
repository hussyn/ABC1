package com.dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	public WebDriver driver;
@BeforeTest
public void setup() {
	
	driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.navigate().to("file:///E:/HTML%20Wireframe/signin.html");

}
@AfterTest

public void tearDown() {
	driver.quit();
}
@DataProvider(name="login")

public static Object[][] login(){

//Object[][] Logincredential=new Object[2][2];
Object[][] Logincredential=new Object[2][2];
Logincredential[0][0]="admin";
Logincredential[0][1]="admin";
Logincredential[1][0]="un";
Logincredential[1][1]="pass";
return Logincredential;	

}

@Test(dataProvider="login")

public void login(String sUsername,String sPassword) {
	
	driver.findElement(By.xpath(".//*[@id='Username']")).sendKeys("");
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("");
	driver.findElement(By.xpath(".//*[@name='login']")).click();
	
	System.out.println(""+sUsername);
	System.out.println(""+sPassword);
}


}
