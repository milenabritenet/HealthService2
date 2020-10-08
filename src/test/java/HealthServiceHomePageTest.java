import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalTime;


public class HealthServiceHomePageTest extends BaseSeleniumTest {


    @Test
    public void HealthServiceTest() throws IOException {
        driver.get("http://localhost:8080/");
        String expectedTitle = "Health Service";
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),expectedTitle);
        SeleniumHelper.takeScreenshot(driver);
    }

}
