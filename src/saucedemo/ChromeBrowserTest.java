package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    static String baseUrl = " https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver(); //1.launch the driver
        driver.get(baseUrl);//2.open the link into Chrome browser
        driver.manage().window().maximize(); //maximize the window
        System.out.println("Print Title : " + driver.getTitle());//3.Print the page title
        System.out.println("Print Current URL :" + driver.getCurrentUrl());//4.Print current Url
        System.out.println("Print Page Source :" + driver.getPageSource());//5.Print Page Source
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); ////we give Implicit wait to driver
        driver.findElement(By.id("user-name")).sendKeys("Khushbu Chaudhari");//find id of username
        driver.findElement(By.name("password")).sendKeys("12345");//find name for password
        driver.close();//closing driver
    }

}
