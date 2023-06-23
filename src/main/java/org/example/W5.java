package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class W5 {
//
//
//    WebElement carouselControlNext = driver.findElement(By.xpath("//a[@class='carousel-control-next']"));
//        System.out.println("carouselControlNext: " + carouselControlNext.getText());
//        carouselControlNext.click();
//    WebElement carouselControlPrev = driver.findElement(By.xpath("//a[@class='carousel-control-prev']"));
//        System.out.println("carouselControlPrev: " + carouselControlPrev.getText());
//        carouselControlPrev.click();
//        Thread.sleep(1000);
//
//
//    By imageItemLocator = By.xpath("//div[@class='card h-100']/a[@href='prod.html?idp_=1']");
//    By titleItemLocator = By.xpath("//div[@class='card h-100']/div/h4/a[@href='prod.html?idp_=1']");
//    By priceItemLocator = By.xpath("//img[@src='imgs/galaxy_s6.jpg']/parent::a[@href='prod.html?idp_=1']/following-sibling::div/h5");
//    By descItemLocator = By.xpath("//img[@src='imgs/galaxy_s6.jpg']/parent::a[@href='prod.html?idp_=1']/following-sibling::div/p");
//
//
//        wait.until(ExpectedConditions.elementToBeClickable(imageItemLocator));
//    WebElement imageItem = driver.findElement(imageItemLocator);
//        imageItem.click();
//        Thread.sleep(1000);
//        driver.navigate().back();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(titleItemLocator));
//    WebElement titleItem = driver.findElement(titleItemLocator);
//        System.out.println((titleItem.getText()));
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(priceItemLocator));
//    WebElement priceItem = driver.findElement(priceItemLocator);
//        System.out.println((priceItem.getText()));
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(descItemLocator));
//    WebElement descItem = driver.findElement(descItemLocator);
//        System.out.println((descItem.getText()));
//
//    String a = "//li[@class='nav-item'][index]";
//    WebElement header;
//
//        for (int i = 1; i <= 7; i++) {
//        if (i != 5 && i != 6) {
//            header = driver.findElement((By.xpath(a.replace("index",String.valueOf(i)))));
//            wait.until(ExpectedConditions.visibilityOf(header));
//            wait.until(ExpectedConditions.elementToBeClickable(header));
//            header.click();
//
//            if(i == 1) {
//                Thread.sleep(1000);
//                WebElement close1 = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[1]"));
//                wait.until(ExpectedConditions.visibilityOf(close1));
//                wait.until(ExpectedConditions.elementToBeClickable(close1));
//                close1.click();
//            }
//
//            if(i == 2) {
//                Thread.sleep(1000);
//                WebElement close2 = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[4]"));
//                wait.until(ExpectedConditions.visibilityOf(close2));
//                wait.until(ExpectedConditions.elementToBeClickable(close2));
//                close2.click();
//            }
//
//            if(i == 3) {
//                Thread.sleep(1000);
//                driver.navigate().back();
//            }
//
//            if(i == 4) {
//                Thread.sleep(1000);
//                WebElement close4 = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[3]"));
//                wait.until(ExpectedConditions.visibilityOf(close4));
//                wait.until(ExpectedConditions.elementToBeClickable(close4));
//                close4.click();
//            }
//
//            if(i == 7) {
//                Thread.sleep(1000);
//                WebElement close5 = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[2]"));
//                wait.until(ExpectedConditions.visibilityOf(close5));
//                wait.until(ExpectedConditions.elementToBeClickable(close5));
//                close5.click();
//            }
//        }
//    }
//
//    String category = "(//a[normalize-space()='value'])[1]";
//    String[] listCategory = { "Phones", "Laptops", "Monitors" };
//    WebElement categorys;
//
//        for (int i = 0; i <= 3; i++) {
//        categorys = driver.findElement((By.xpath(category.replace("value",listCategory[i]))));
//        wait.until(ExpectedConditions.visibilityOf(categorys));
//        wait.until(ExpectedConditions.elementToBeClickable(categorys));
//        System.out.println("Category: " + categorys.getText());
//        categorys.click();
//
//    }
}
