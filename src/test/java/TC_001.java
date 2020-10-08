import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_001 extends BaseSeleniumTest {


    @Test
    public void HealthServiceTest() {
        driver.get("http://localhost:8080/");

        String expectedTitle = "Health Service";
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),expectedTitle);

        driver.findElement(By.linkText("Doctors")).click();
        /*driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);DLACZEGO TU JEST TYLKO TEN TESTCASE*/
    }


    }
}
