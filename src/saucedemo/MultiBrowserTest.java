package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;
    static String browser = "Edge";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong Browser name ");
        }
        driver.get(baseUrl); //open the link into Chrome browser
        driver.manage().window().maximize(); //maximize the window
        System.out.println("Print Title" + driver.getTitle()); //Print the title of the website
        System.out.println("Print Current URL :" + driver.getCurrentUrl()); //Print current Url
        System.out.println("Print PageSource: " + driver.getPageSource()); //Print page Source
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); ////we give Implicit wait to driver
        driver.findElement(By.id("user-name")).sendKeys("Khushbu Chaudhari");//find id of username
        driver.findElement(By.name("password")).sendKeys("12345");//find name for password
        driver.close(); //driver closing
    }
}
