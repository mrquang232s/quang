package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class commit {
    public WebDriver edriver;
    public WebDriverWait ewait;

    @FindBy(how = How.XPATH, using = "//a[@id='cartur']")
    public WebElement placeOrderHeader;

    @FindBy(how = How.XPATH, using = "//li[@class='nav-item active']//a[@class='nav-link']")
    public WebElement homeHeader;

    @FindBy(how = How.XPATH, using = "//div[@id='orderModal']//button[@type='button'][normalize-space()='Close']")
    public WebElement closeForm;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Place Order']")
    public WebElement buttonPlaceOrder;

    @FindBy(how = How.ID, using = "name")
    public WebElement nameInput;

    @FindBy(how = How.ID, using = "country")
    public WebElement countryInput;

    @FindBy(how = How.ID, using = "city")
    public WebElement cityInput;

    @FindBy(how = How.ID, using = "card")
    public WebElement cardInput;

    @FindBy(how = How.ID, using = "month")
    public WebElement monthInput;

    @FindBy(how = How.ID, using = "year")
    public WebElement yearInput;
    public commit(){
        edriver = new EdgeDriver();
        PageFactory.initElements(edriver, this);
        ewait = new WebDriverWait(edriver, Duration.ofSeconds(5));;
    }
    @Before
    public void setUp(){
        edriver.manage().window().maximize(); // Phóng to trình duyệt
        edriver.get("https://www.demoblaze.com/");
    }
    @Test
    public void test() throws Exception {
        // Click Button
        waitUntilElementVisible(placeOrderHeader);
        placeOrderHeader.click();
        waitUntilElementVisible(buttonPlaceOrder);
        buttonPlaceOrder.click();

        // Nhập form
        waitUntilElementVisible(nameInput);
        nameInput.clear();
        nameInput.sendKeys("Hiếu Nguyễn");
        waitUntilElementVisible(countryInput);
        countryInput.clear();
        countryInput.sendKeys("Việt Nam");
        waitUntilElementVisible(cityInput);
        cityInput.clear();
        cityInput.sendKeys("Hồ Chí Minh");
        waitUntilElementVisible(cardInput);
        cardInput.clear();
        cardInput.sendKeys("123");
        waitUntilElementVisible(monthInput);
        monthInput.clear();
        monthInput.sendKeys("06");
        waitUntilElementVisible(yearInput);
        yearInput.clear();
        yearInput.sendKeys("2023");

        waitUntilElementVisible(closeForm);
        closeForm.click();

        waitUntilElementVisible(homeHeader);
        homeHeader.click();
    }
    @After
    public void tearDown() throws InterruptedException {
    }

    public void waitUntilElementVisible(WebElement element){
        int tryTimes = 0;
        while (tryTimes < 2){
            try {
                ewait.until(ExpectedConditions.visibilityOf(element));
                break;
            }
            catch (StaleElementReferenceException se){
                tryTimes ++;
                if (tryTimes == 2)
                    throw se;
            }
        }
    }

    public void waitUntilElementVisible(String path) throws Exception{
        int tryTimes = 0;
        while (tryTimes < 2){
            try {
                WebElement element = edriver.findElement(By.xpath(path));
                ewait.until(ExpectedConditions.visibilityOf(element));
                break;
            }
            catch (StaleElementReferenceException se){
                tryTimes ++;
                if (tryTimes == 2)
                    throw se;
            }
        }
    }

}
