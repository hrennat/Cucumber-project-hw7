package stepdefs;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void openOnliner() throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = driver.findElement(By.className("b-main-navigation"));
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    @After
    public void driverQuit() {


        driver.quit();
    }
}