package a.Uploadfile;

import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class PG10 {
    public static void main(String[] args) {
        
       // System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
                String baseUrl = "http://spreadsheetpage.com/index.php/files";
        WebDriver driver = new FirefoxDriver();

        driver.get(baseUrl);
        WebElement downloadButton = driver.findElement(By.id("messenger-download"));
        
        String sourceLocation = downloadButton.getAttribute("href");
        String wget_command = "cmd /c E:\\TestData\\uploadfolder\\new\\wget.exe -P E: --no-check-certificate " + sourceLocation;

        try {
        Process exec = Runtime.getRuntime().exec(wget_command);
        int exitVal = exec.waitFor();
        System.out.println("Exit value: " + exitVal);
        } catch (InterruptedException | IOException ex) {
        System.out.println(ex.toString());
        }
        driver.close();
        }
        
}