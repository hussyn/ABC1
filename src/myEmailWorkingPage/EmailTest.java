package myEmailWorkingPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EmailTest {
    private NadaEMailService nada;
    private WebDriver driver;
    private IsMyEmailWorkingPage page;

    @BeforeTest
    public void setup() {
        nada = new NadaEMailService();
        driver = DriverManager.getDriver();
        page = new IsMyEmailWorkingPage(driver);
    }

    @Test
    public void emailTest() throws IOException, UnirestException {
        page.goTo();
        page.checkEmail(nada.getEmailId());
        String emailContent = nada.getMessageWithSubjectStartsWith("IsMyEmailWorking").getText();
        System.out.println(emailContent);
    }
}