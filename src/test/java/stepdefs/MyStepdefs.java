package stepdefs;

import PageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class MyStepdefs {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait wait;

    @Given("^open onliner\\.by$")
    public void openOnlinerBy() {
    }


    @When("hover Автобарахолка")
    public void hover() throws Throwable {
        HomePage home = new HomePage(driver);
        home.hoverElement();

    }

   @Then("^category by_price is displayed$")
    public void categoryBy_priceIsDisplayed() throws InterruptedException {
        HomePage home = new HomePage(driver);
        List<String> a =  home.findElementsByPrice();
        List<String> autoList = home.createAutoList();
       Assert.assertEquals(autoList, a);


    }

   @Then("^category by_city is displayed$")
    public void categoryBy_cityIsDisplayed() {
        HomePage home = new HomePage(driver);
        List<String> a =  home.findElementsByCity();
        List<String> autoList = home.createListByCity();
        Assert.assertEquals(autoList, a);


    }

    @Then("^category by_model is displayed$")
    public void categoryBy_modelIsDisplayed() {
        HomePage home = new HomePage(driver);
        List<String> a =  home.findElementsByModel();
        List<String> autoList = home.createAutoListByModel();
        Assert.assertEquals(autoList, a);


    }


    @When("hover Дома и квартиры")
    public void hoverДомаИКвартиры() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.hoverElementAppts();
    }

    @Then("category by_location is displayed")
    public void categoryBy_locationIsDisplayed() throws InterruptedException {
        HomePage home = new HomePage(driver);
        List<String> a =  home.findElementsByLocation();
        List<String> apptList = home.createListByLocation();
        Assert.assertEquals(apptList, a);
    }

    @Then("category by_rooms is displayed")
    public void categoryBy_roomsIsDisplayed() {
        HomePage home = new HomePage(driver);
        List<String> a =  home.findElementsByRooms();
        List<String> apptList = home.createListByRooms();
        Assert.assertEquals(apptList, a);
    }

    @Then("category by_apptPrice is displayed")
    public void categoryBy_apptPriceIsDisplayed() {
        HomePage home = new HomePage(driver);
        List<String> a =  home.findElementsByApptPrice();
        List<String> apptList = home.createListByApptPrice();
        Assert.assertEquals(apptList, a);
    }
}
