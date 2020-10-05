import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

//Do poprawy



public class TC_004 extends BaseSeleniumTest{
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
        PageFactory.initElements(driver,this);
        searchBtn.click();
        PageFactory.initElements(driver,this);
        keyword.sendKeys("Gregory Duda");
        PageFactory.initElements(driver,this);
        searchBtn2.click();
        Assert.assertEquals( driver.findElement(By.xpath("//tbody")).getText(),"");
        PageFactory.initElements(driver,this);
        homeBtn.click();
    }
}
