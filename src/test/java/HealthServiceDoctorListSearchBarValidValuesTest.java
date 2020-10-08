import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class HealthServiceDoctorListSearchBarValidValuesTest extends BaseSeleniumTest{
    @FindBy(linkText = "Doctors")
    private WebElement doctorsBtn;

    @FindBy(linkText = "Search")
    private WebElement searchBtn;

    @FindBy(id = "keyword")
    private WebElement keyword;

    @FindBy(xpath = "//input[@value='Search']")
    private WebElement searchBtn2;

    @FindBy(tagName = "a")
    private WebElement homeBtn;


    @Test
    public void HealthServiceTest() throws IOException {
        driver.get("http://localhost:8080/doctors/list");
        PageFactory.initElements(driver,this);
        searchBtn.click();
        keyword.sendKeys("Gregory House");
        searchBtn2.click();
        Assert.assertEquals( driver.findElement(By.xpath("//td")).getText(),"Gregory");
        SeleniumHelper.takeScreenshot(driver);
        homeBtn.click();
    }
}
