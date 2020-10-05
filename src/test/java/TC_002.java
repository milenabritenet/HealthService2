import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_002 extends BaseSeleniumTest{

    @FindBy(linkText = "Doctors")
    private WebElement doctorsBtn;

//correct
    @Test
    public void HealthServiceTest() {
        driver.get("http://localhost:8080/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        PageFactory.initElements(driver,this);
        doctorsBtn.click();
        String expectedTitle = "Doctors";
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }
}
