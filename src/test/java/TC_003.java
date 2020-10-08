import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_003 extends BaseSeleniumTest{
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
    public void HealthServiceTest() {
        driver.get("http://localhost:8080/doctors/list");
        PageFactory.initElements(driver,this);
        searchBtn.click();
        PageFactory.initElements(driver,this);
        keyword.sendKeys("Gregory House");
        PageFactory.initElements(driver,this);
        searchBtn2.click();
        Assert.assertEquals( driver.findElement(By.xpath("//td")).getText(),"Gregory");
        PageFactory.initElements(driver,this);
        homeBtn.click();
    }
}
