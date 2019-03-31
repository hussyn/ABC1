package com.testcases;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllEmpTestCases {
	
	WebDriver  wd= null;
	WebElement we = null;
	String sXpath = null;
	String sExp = null;
	String sAct = null;
	String sIp	= null;
	String sLoginPage = "file:///C:/Users/admin/Desktop/selenium/Offline%20Website%20new/index.html";
	
	public void navigateToAll()
	{
		wd = new FirefoxDriver();
		wd.get(sLoginPage);
	}
	
	@Test(priority = 1)
	public void BlankLoginID()
	{	
		navigateToAll();
		sXpath = "/html/body/div/div[2]/form/div[1]/input";
		sIp = "";
		sExp = "file:///C:/Users/admin/Desktop/selenium/Offline%20Website%20new/index.html";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		we.submit();
		new WebDriverWait(wd, 5);
		sAct = wd.getCurrentUrl();
//		System.out.println("Current url is : "+sAct);
		Assert.assertEquals(sAct, sExp);
		
	}
	
	@Test
	public void CapitalAlphabateLoginId()
	{
		wd.get(sLoginPage);
		sXpath = "/html/body/div/div[2]/form/div[1]/input";
		sIp = "ABCDEFGHIJKLMNOPQURSTUVWXYZ";
		sExp = "file:///C:/Users/admin/Desktop/selenium/Offline%20Website%20new/index.html";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		we.submit();
		new WebDriverWait(wd, 5);
		sAct = wd.getCurrentUrl();
//		System.out.println("Current url is : "+sAct);
		Assert.assertEquals(sAct, sExp);
	
	}

	@Test
	public void NumericLoginId()
	{
		wd.get(sLoginPage);
		sXpath = "/html/body/div/div[2]/form/div[1]/input";
		sIp = "1234567890";
		sExp = "file:///C:/Users/admin/Desktop/selenium/Offline%20Website%20new/index.html";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		we.submit();
		new WebDriverWait(wd, 5);
		sAct = wd.getCurrentUrl();
//		System.out.println("Current url is : "+sAct);
		Assert.assertEquals(sAct, sExp);
	}
	
	@Test
	public void AlphaNumericLoginId()
	{
		wd.get(sLoginPage);
		sXpath = "/html/body/div/div[2]/form/div[1]/input";
		sIp = "ABCDEFGHIJKLMNOPQURSTUVWXYZ1234567890";
		sExp = "file:///C:/Users/admin/Desktop/selenium/Offline%20Website%20new/index.html";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		we.submit();
		new WebDriverWait(wd, 5);
		sAct = wd.getCurrentUrl();
//		System.out.println("Current url is : "+sAct);
		Assert.assertEquals(sAct, sExp);
	
	}
	
	@Test
	public void SpecialCharLoginId()
	{
		wd.get(sLoginPage);
		sXpath = "/html/body/div/div[2]/form/div[1]/input";
		sIp = "`~!@#$%^&*()_+|\\][";
		sExp = "file:///C:/Users/admin/Desktop/selenium/Offline%20Website%20new/index.html";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		we.submit();
		new WebDriverWait(wd, 5);
		sAct = wd.getCurrentUrl();
//		System.out.println("Current url is : "+sAct);
		Assert.assertEquals(sAct, sExp);
	
	}
	
	@Test
	public void BlankPassword()
	{
		wd.get(sLoginPage);
		sXpath = "/html/body/div/div[2]/form/div[2]/input";
		sIp = "";
		sExp = "file:///C:/Users/admin/Desktop/selenium/Offline%20Website%20new/index.html";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		we.submit();
		new WebDriverWait(wd, 5);
		sAct = wd.getCurrentUrl();
//		System.out.println("Current url is : "+sAct);
		Assert.assertEquals(sAct, sExp);	
	}

	@Test
	public void InvalidPassword()
	{
		wd.get(sLoginPage);
		sXpath = "/html/body/div/div[2]/form/div[2]/input";
		sIp = "Asdfawer23";
		sExp = "file:///C:/Users/admin/Desktop/selenium/Offline%20Website%20new/index.html";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		we.submit();
		new WebDriverWait(wd, 5);
		sAct = wd.getCurrentUrl();
//		System.out.println("Current url is : "+sAct);
		Assert.assertEquals(sAct, sExp);	
	}
	
	@Test
	public void CapitalAlphabatsOnlyPassword()
	{
		wd.get(sLoginPage);
		sXpath = "/html/body/div/div[2]/form/div[2]/input";
		sIp = "ABCDEFGHIJKLMNOPQURSTUVWXYZ";
		sExp = "file:///C:/Users/admin/Desktop/selenium/Offline%20Website%20new/index.html";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		we.submit();
		new WebDriverWait(wd, 5);
		sAct = wd.getCurrentUrl();
//		System.out.println("Current url is : "+sAct);
		Assert.assertEquals(sAct, sExp);	
	}	
	
	@Test
	public void NumericOnlyPassword()
	{
		wd.get(sLoginPage);
		sXpath = "/html/body/div/div[2]/form/div[2]/input";
		sIp = "01234567890";
		sExp = "file:///C:/Users/admin/Desktop/selenium/Offline%20Website%20new/index.html";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		we.submit();
		new WebDriverWait(wd, 5);
		sAct = wd.getCurrentUrl();
//		System.out.println("Current url is : "+sAct);
		Assert.assertEquals(sAct, sExp);	
	}	
	
	@Test
	public void AlphaNumericPassword()
	{
		wd.get(sLoginPage);
		sXpath = "/html/body/div/div[2]/form/div[2]/input";
		sIp = "Absdf01234567890";
		sExp = "file:///C:/Users/admin/Desktop/selenium/Offline%20Website%20new/index.html";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		we.submit();
		new WebDriverWait(wd, 5);
		sAct = wd.getCurrentUrl();
//		System.out.println("Current url is : "+sAct);
		Assert.assertEquals(sAct, sExp);	
	}	
		
	@Test
	public void SpecialCharacterOnlyPassword()
	{
		wd.get(sLoginPage);
		sXpath = "/html/body/div/div[2]/form/div[2]/input";
		sIp = "`~!@#$%^&*()_+=]{[}\\|''";
		sExp = "file:///C:/Users/admin/Desktop/selenium/Offline%20Website%20new/index.html";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		we.submit();
		new WebDriverWait(wd, 5);
		sAct = wd.getCurrentUrl();
//		System.out.println("Current url is : "+sAct);
		Assert.assertEquals(sAct, sExp);	
	}
	
	@Test
	public void BlankLoginIdPassword()
	{	
		wd.get(sLoginPage);
		// Login
		sXpath = "/html/body/div/div[2]/form/div[1]/input";
		sIp = "";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		
		// Password
		sXpath = "/html/body/div/div[2]/form/div[2]/input";
		sIp = "";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		
		we.submit();
		new WebDriverWait(wd, 5);
		
		sExp = sLoginPage;
		sAct = wd.getCurrentUrl();
		
		Assert.assertEquals(sAct, sExp);
	}

	@Test
	public void BlankLoginAndInvalidPassword()
	{
		wd.get(sLoginPage);
		// Login
		sXpath = "/html/body/div/div[2]/form/div[1]/input";
		sIp = "";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		
		// Password
		sXpath = "/html/body/div/div[2]/form/div[2]/input";
		sIp = "asdferw";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		
		we.submit();
		new WebDriverWait(wd, 5);
		
		sExp = sLoginPage;
		sAct = wd.getCurrentUrl();
		
		Assert.assertEquals(sAct, sExp);
	}

	@Test
	public void BlankLoginAndValidPassword()
	{
		wd.get(sLoginPage);
		// Login
		sXpath = "/html/body/div/div[2]/form/div[1]/input";
		sIp = "";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		
		// Password
		sXpath = "/html/body/div/div[2]/form/div[2]/input";
		sIp = "JBK";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		
		we.submit();
		new WebDriverWait(wd, 5);
		
		sExp = sLoginPage;
		sAct = wd.getCurrentUrl();
		
		Assert.assertEquals(sAct, sExp);
	}

	@Test
	public void BlankLoginAndCapitalAlphbaticPasswordOnly()
	{
		wd.get(sLoginPage);
		// Login
		sXpath = "/html/body/div/div[2]/form/div[1]/input";
		sIp = "";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		
		// Password
		sXpath = "/html/body/div/div[2]/form/div[2]/input";
		sIp = "ABCDEFGH";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		
		we.submit();
		new WebDriverWait(wd, 5);
		
		sExp = sLoginPage;
		sAct = wd.getCurrentUrl();
		
		Assert.assertEquals(sAct, sExp);
	}

	@Test
	public void BlankLoginAndSmallAlphabaticPassword()
	{
		wd.get(sLoginPage);
		// Login
		sXpath = "/html/body/div/div[2]/form/div[1]/input";
		sIp = "";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		
		// Password
		sXpath = "/html/body/div/div[2]/form/div[2]/input";
		sIp = "asdferw";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		
		we.submit();
		new WebDriverWait(wd, 5);
		
		sExp = sLoginPage;
		sAct = wd.getCurrentUrl();
		
		Assert.assertEquals(sAct, sExp);
	}

	@Test
	public void BlankLoginAndNumericPassword()
	{
		wd.get(sLoginPage);
		// Login
		sXpath = "/html/body/div/div[2]/form/div[1]/input";
		sIp = "";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		
		// Password
		sXpath = "/html/body/div/div[2]/form/div[2]/input";
		sIp = "1234567890";
		we = wd.findElement(By.xpath(sXpath));
		we.sendKeys(sIp);
		
		we.submit();
		new WebDriverWait(wd, 5);
		
		sExp = sLoginPage;
		sAct = wd.getCurrentUrl();
		
		Assert.assertEquals(sAct, sExp);
	}
}
