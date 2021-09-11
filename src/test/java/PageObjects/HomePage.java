package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class HomePage extends BaseClass {



    public HomePage(WebDriver driver) {

        super(driver, wait);
        PageFactory.initElements(BaseClass.driver, this);
    }

    Actions action = new Actions(driver);

    @FindBy(xpath = "//*[@id='container']/div/div/header/div[2]/div/nav/ul[1]/li[3]/a[2]/span")
    WebElement auto;
    @FindBy(xpath = "//*[@id='container']/div/div/header/div[2]/div/nav/ul[1]/li[4]/a/span")
    WebElement appt;

    @FindBy(xpath = "//span[text()='Новые авто']")
    WebElement firstElement;

    @FindBy(xpath = "//span[text()='Минск']")
    WebElement firstCity;
    @FindBy(xpath = "//*[@id='container']/div/div/header/div[2]/div/nav/ul[1]/li[4]/div/div/div/div/div[1]/div[2]/div/div[1]/ul/li[1]/a/span[1]")
    WebElement firstLocation;
    @FindBy(xpath = "//span[text()='1-комнатные']")
    WebElement firstRooms;
    @FindBy(xpath = "//span[text()='До 30 000 $']")
    WebElement firstPrice;

    @FindBy(xpath = "//span[text()='Audi']")
    WebElement firstModel1;
    @FindBy(xpath = "//span[text()='Nissan']")
    WebElement firstModel2;

    @FindBy(xpath = "//ul[@class ='b-main-navigation__dropdown-advert-list']")
    WebElement listByPrice;

    @FindBy(xpath = "//*[@id='container']/div/div/header/div[2]/div/nav/ul[1]/li[3]/div/div/div/div/div[1]/div[2]/div/div[2]/ul")
    WebElement listByCity;

    @FindBy(xpath = "//*[@id='container']/div/div/header/div[2]/div/nav/ul[1]/li[3]/div/div/div/div/div[1]/div[2]/div/div[3]/ul")
    WebElement listByModel1;
    @FindBy(xpath = "//*[@id='container']/div/div/header/div[2]/div/nav/ul[1]/li[3]/div/div/div/div/div[1]/div[2]/div/div[4]/ul")
    WebElement listByModel2;

    @FindBy(xpath = "//*[@id='container']/div/div/header/div[2]/div/nav/ul[1]/li[4]/div/div/div/div/div[1]/div[2]/div/div[1]/ul")
    WebElement listByLocation;
    @FindBy(xpath = "//*[@id='container']/div/div/header/div[2]/div/nav/ul[1]/li[4]/div/div/div/div/div[1]/div[2]/div/div[2]/ul")
    WebElement listByRooms;
    @FindBy(xpath = "//*[@id='container']/div/div/header/div[2]/div/nav/ul[1]/li[4]/div/div/div/div/div[1]/div[2]/div/div[3]/ul")
    WebElement listByApptPrice;


    public void hoverElement() throws InterruptedException {
     action.moveToElement(auto).perform();
     //name = auto.getText();
        Thread.sleep(900);
    }

    public void hoverElementAppts() throws InterruptedException {
        action.moveToElement(appt).perform();
        Thread.sleep(1000);
    }

    public List<String> findElementsByPrice() throws InterruptedException {
        String first = firstElement.getText();
        List<WebElement> aB = listByPrice.findElements(By.className("b-main-navigation__dropdown-advert-sign"));
        Thread.sleep(900);
        List<String> a = new ArrayList<>();
        for (int i = 1; i < aB.size(); i++) {
            String text = aB.get(i).getText();
            a.add(text);
        }
        a.add(0, first);
        return a;
    }

    public List<String> findElementsByCity() {
        String first = firstCity.getText();
        List<WebElement> aB = listByCity.findElements(By.className("b-main-navigation__dropdown-advert-sign"));
        List<String> a = new ArrayList<>();
        for (int i = 1; i < aB.size(); i++) {
            String text = aB.get(i).getText();
            a.add(text);
        }
        a.add(0, first);
        return a;
    }

    public List<String> findElementsByModel() {
        String first = firstModel1.getText();
        String six = firstModel2.getText();
        List<WebElement> aB1 = listByModel1.findElements(By.className("b-main-navigation__dropdown-advert-sign"));
        List<WebElement> aB2 = listByModel2.findElements(By.className("b-main-navigation__dropdown-advert-sign"));
        List<String> a = new ArrayList<>();
        for (int i = 1; i < aB1.size(); i++) {
            String text = aB1.get(i).getText();
            a.add(text);
        }
        a.add(0, first);

        List<String> b = new ArrayList<>();
        for (int i = 1; i < aB2.size(); i++) {
            String text = aB2.get(i).getText();
            b.add(text);
        }
        b.add(0, six);
        List<String> newList = new ArrayList<>();
        Stream.of(a, b).forEach(newList::addAll);
        return newList;
    }

    public List<String> findElementsByLocation() throws InterruptedException {
        String first = firstLocation.getText();
        List<WebElement> appts = listByLocation.findElements(By.className("b-main-navigation__dropdown-advert-sign"));
        Thread.sleep(1000);
        List<String> appt = new ArrayList<>();
        for (int i = 1; i < appts.size(); i++) {
            String text = appts.get(i).getText();
            appt.add(text);
        }
        appt.add(0, first);
        return appt;
    }
    public List<String> findElementsByRooms() {
        String first = firstRooms.getText();
        List<WebElement> appts = listByRooms.findElements(By.className("b-main-navigation__dropdown-advert-sign"));
        List<String> appt = new ArrayList<>();
        for (int i = 1; i < appts.size(); i++) {
            String text = appts.get(i).getText();
            appt.add(text);
        }
        appt.add(0, first);
        return appt;
    }



    public List<String> findElementsByApptPrice() {
        String first = firstPrice.getText();
        List<WebElement> appts = listByApptPrice.findElements(By.className("b-main-navigation__dropdown-advert-sign"));
        List<String> appt = new ArrayList<>();
        for (int i = 1; i < appts.size(); i++) {
            String text = appts.get(i).getText();
            appt.add(text);
        }
        appt.add(0, first);
        return appt;
    }
    public List<String> createAutoList (){
        List<String> autoList =  new ArrayList<String>();
        autoList.add("Новые авто");
        autoList.add("С пробегом");
        autoList.add("Цена с НДС");
        autoList.add("Авто до 4000 р.");
        autoList.add("Авто до 10 000 р.");
        autoList.add("Авто до 20 000 р.");
        return autoList;


    }

    public List<String> createListByCity (){
        List<String> cityList =  new ArrayList<String>();
        cityList.add("Минск");
        cityList.add("Гомель");
        cityList.add("Могилев");
        cityList.add("Витебск");
        cityList.add("Гродно");
        cityList.add("Брест");
        return cityList;


    }

    public List<String> createAutoListByModel (){
        List<String> autoList =  new ArrayList<String>();
        autoList.add("Audi");
        autoList.add("BMW");
        autoList.add("Citroen");
        autoList.add("Ford");
        autoList.add("Mazda");
        autoList.add("Mercedes-Benz");
        autoList.add("Nissan");
        autoList.add("Opel");
        autoList.add("Peugeot");
        autoList.add("Renault");
        autoList.add("Toyota");
        autoList.add("Volkswagen");
        return autoList;


    }

    public List<String> createListByRooms (){
        List<String> roomList =  new ArrayList<String>();
        roomList.add("1-комнатные");
        roomList.add("2-комнатные");
        roomList.add("3-комнатные");
        roomList.add("4+-комнатные");
        return roomList;

    }

    public List<String> createListByApptPrice (){
        List<String> apptPriceList =  new ArrayList<String>();
        apptPriceList.add("До 30 000 $");
        apptPriceList.add("30 000–80 000 $");
        apptPriceList.add("От 80 000 $");
        return apptPriceList;

    }
    public List<String> createListByLocation (){
        List<String> cityList =  new ArrayList<String>();
        cityList.add("Минск");
        cityList.add("Брест");
        cityList.add("Витебск");
        cityList.add("Гомель");
        cityList.add("Гродно");
        cityList.add("Могилев");
        return cityList;


    }



}