package a.collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

@Action(name="Click Menu Links")
public class ClickMenuLinks implements WebAction {


    public ArrayList<String> menuItems = new ArrayList<>();

    @Override
    public ExecutionResult execute(WebAddonHelper webAddonHelper) throws FailureException {

        //Get Web Driver instance
        WebDriver driver = webAddonHelper.getDriver();

        for(WebElement menu: driver.findElements(By.cssSelector(".navbar-fixed-top"))){

            if(!menu.isDisplayed())
                continue;

            for (WebElement element: menu.findElements(By.tagName("li"))) {
                menuItems.add(element.getText());
            }


            //Click all the heading
            for (String heading: menuItems) {
                driver.findElementByLinkText(heading).click();
            }

        }

        return ExecutionResult.PASSED;
    }
}