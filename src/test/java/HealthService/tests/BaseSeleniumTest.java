package HealthService.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public abstract class BaseSeleniumTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.out.println("Starting the Test");
        String driverPath = "C:\\Users\\BRITENET\\Downloads\\gs-accessing-data-mysql-master\\HealthServiceTests\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/");

    }

    @AfterMethod
    public void teardown() throws InterruptedException {
        System.out.println("Ending the Test");
        Thread.sleep(5000);
        driver.quit();
    }
}
///comment
