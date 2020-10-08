import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HealthServiceDoctorDetailsTest extends BaseSeleniumTest{
    @FindBy(linkText = "Doctors")
    private WebElement doctorsBtn;

    @FindBy(xpath = "/html/body/div/div/div/div/div/div/table/tbody/tr[1]/td[11]/a/i")
    private WebElement infoBtn;

    @FindBy(tagName = "a")
    private WebElement homeBtn;


    @Test
    public void HealthServiceTest() throws IOException {
        driver.get("http://localhost:8080/");
        String expectedTitle = "Health Service";
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),expectedTitle);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        PageFactory.initElements(driver,this);
        doctorsBtn.click();
        String expectedTitle2 = "Doctors";
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),expectedTitle2);
        infoBtn.click();
        String expectedTitle3 = "Doctor";
        Assert.assertEquals(driver.getTitle(),expectedTitle3);
        SeleniumHelper.takeScreenshot(driver);
        homeBtn.click();

    }
}
