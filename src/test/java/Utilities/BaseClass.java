package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BaseClass {

    public static WebDriver driver;
    public  static WebDriverWait wait;

    public BaseClass(WebDriver driver,WebDriverWait wait) {

        BaseClass.driver = driver;
       BaseClass.wait = wait;
    }

   protected void WaitUntilElementVisible(List<WebElement> element) {

       wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }
}