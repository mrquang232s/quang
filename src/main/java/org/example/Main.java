package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class Main {


    public static void main(String[] args) throws InterruptedException {
// Thiết lập đường dẫn đến ChromeDriver
//        System.setProperty("webdriver.chrome.driver", "C:\\active\\HocTap\\java-automation\\untitled\\drive\\chromedriver.exe");

        // Tạo ChromeOptions và cấu hình tải xuống
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--disable-extensions"); // Vô hiệu hóa tiện ích mở rộng
        options.addArguments("--start-maximized"); // Mở trình duyệt ở chế độ toàn màn hình
        options.addArguments("--disable-popup-blocking"); // Vô hiệu hóa chặn popup

        // Khởi tạo ChromeDriver với ChromeOptions đã cấu hình
        EdgeDriver driver = new EdgeDriver(options);

        driver.get("http://omayo.blogspot.com/p/page7.html?utm_source=zalo&utm_medium=zalo&utm_campaign=zalo");

        // Đợi cho trang tải hoàn thành
        Thread.sleep(5000); // Chờ 5 giây để trang tải hoàn thành

        // Tìm phần tử chứa nút tải xuống
        WebElement downloadButton = driver.findElement(By.xpath("//a[normalize-space()='ZIP file']"));

        // Nhấp vào nút tải xuống
        downloadButton.click();

        // Đợi cho tệp tin tải xuống
        Thread.sleep(5000); // Chờ 5 giây để tệp tin tải xuống

        // Đóng trình duyệt
        driver.quit();

    }
}