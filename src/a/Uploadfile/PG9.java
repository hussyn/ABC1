package a.Uploadfile;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class PG9 {
    public static void main(String[] args) {
        //System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
        String baseUrl = "http://demo.guru99.com/test/upload/";
        WebDriver driver = new FirefoxDriver();

        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // enter the file path onto the file-selection input field
        //uploadElement.sendKeys("E:\\TestData\\uploadfolder\\UploadFile.txt");
        uploadElement.sendKeys("E:\\TestData\\uploadfolder\\test.pdf");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        }
}