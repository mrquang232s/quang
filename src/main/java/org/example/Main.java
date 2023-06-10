package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.demoblaze.com/#");
        Thread.sleep(10000);

//        Category
        WebElement butotnPhone = driver.findElement(By.xpath("//a[@onclick=\"byCat('phone')\"]"));
        WebElement butotnNotebook = driver.findElement(By.xpath("//a[@onclick=\"byCat('notebook')\"]"));
        WebElement butotnMonitor = driver.findElement(By.xpath("//a[@onclick=\"byCat('monitor')\"]"));

        WebElement headerHome = driver.findElement(By.xpath("//ul[@class=\"navbar-nav ml-auto\"]/li[@class=\"nav-item active\"]"));
        WebElement headerContact = driver.findElement(By.xpath("//ul[@class=\"navbar-nav ml-auto\"]/li[@class=\"nav-item\"]/a[@data-target=\"#videoModal\"]"));
        WebElement headerAboutUs = driver.findElement(By.xpath("//ul[@class=\"navbar-nav ml-auto\"]/li[@class=\"nav-item\"]/a[@data-target=\"#videoModal\"]"));
        WebElement headerCart = driver.findElement(By.xpath("//ul[@class=\"navbar-nav ml-auto\"]/li[@class=\"nav-item\"]/a[@id=\"cartur\"]"));
        WebElement headerLogin = driver.findElement(By.xpath("//ul[@class=\"navbar-nav ml-auto\"]/li[@class=\"nav-item\"]/a[@data-target=\"#logInModal\"]"));
        WebElement headerSignUp = driver.findElement(By.xpath("//ul[@class=\"navbar-nav ml-auto\"]/li[@class=\"nav-item\"]/a[@data-target=\"#signInModal\"]"));

        WebElement imageItem = driver.findElement((By.xpath("//div[@class=\"card h-100\"]/a[@href=\"prod.html?idp_=1\"]")));
        WebElement titleItem = driver.findElement((By.xpath("//div[@class=\"card h-100\"]/div/h4/a[@href=\"prod.html?idp_=1\"]")));
        WebElement priceItem = driver.findElement((By.xpath("//img[@src=\"imgs/galaxy_s6.jpg\"]/parent::a[@href='prod.html?idp_=1']/following-sibling::div/h5")));
        WebElement descItem = driver.findElement((By.xpath("//img[@src=\"imgs/galaxy_s6.jpg\"]/parent::a[@href='prod.html?idp_=1']/following-sibling::div/p")));
        System.out.println(descItem.getText());
//        imageItem.click();
    }
}