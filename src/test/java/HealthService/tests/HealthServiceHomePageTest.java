package HealthService.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class HealthServiceHomePageTest extends BaseSeleniumTest {


    @Test
    public void HealthServiceTest() throws IOException {
        String expectedTitle = "Health Service";
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),expectedTitle);
        SeleniumHelper.takeScreenshot(driver);
    }

}
