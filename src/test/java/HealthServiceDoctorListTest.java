import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HealthServiceDoctorListTest extends BaseSeleniumTest{

    @FindBy(linkText = "Doctors")
    private WebElement doctorsBtn;


    @Test
    public void HealthServiceTest() throws IOException {
        driver.get("http://localhost:8080/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        PageFactory.initElements(driver,this);
        doctorsBtn.click();
        String expectedTitle = "Doctors";
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),expectedTitle);
        SeleniumHelper.takeScreenshot(driver);
    }
}
