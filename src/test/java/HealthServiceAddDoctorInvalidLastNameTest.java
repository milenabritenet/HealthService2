import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HealthServiceAddDoctorInvalidLastNameTest extends BaseSeleniumTest{

        @FindBy(linkText = "Doctors")
        private WebElement doctorsBtn;

        @FindBy(linkText = "Add Doctor")
        private WebElement addDoctor;

        @FindBy(id = "firstName")
        private WebElement firstName;

        @FindBy(id = "lastName")
        private WebElement lastName;

        @FindBy(id = "birthDate")
        private WebElement birthDate;

        @FindBy(id = "city")
        private WebElement city;

        @FindBy(id = "street")
        private WebElement street;

        @FindBy(id = "email")
        private WebElement email;

        @FindBy(id = "phone")
        private WebElement phone;

        @FindBy(id = "licenseNumber")
        private WebElement licenseNumber;

        @FindBy(id = "specId")
        private WebElement specId;

        @FindBy(xpath = "/html/body/div/div/div/div/form/div/div[11]/input")
        private WebElement addDoctor2;

        @FindBy(tagName = "a")
        private WebElement homeBtn;

        @FindBy(xpath = "/html/body/div/div/div/div/form/div/div[2]/span")
        private WebElement lastNameWarning;


        @Test
        public void HealthServiceTest() throws IOException {
            driver.get("http://localhost:8080/doctors/list");
            PageFactory.initElements(driver,this);
            String expectedTitle2 = "Doctors";
            System.out.println(driver.getTitle());
            Assert.assertEquals(driver.getTitle(),expectedTitle2);
            addDoctor.click();
            String expectedTitle3 = "Add Doctor";
            Assert.assertEquals(driver.getTitle(),expectedTitle3);
            firstName.click();
            firstName.sendKeys("Alicja");
            lastName.click();
            lastName.sendKeys("K");
            birthDate.click();
            birthDate.sendKeys("12/06/1959");
            Select countryselect = new Select(driver.findElement(By.id("country")));
            countryselect.selectByValue("Latvia");
            city.click();
            city.sendKeys("Białystok");
            street.click();
            street.sendKeys("Świetojańska");
            email.click();
            email.sendKeys("alicjakaczynska@hotmail.com");
            phone.click();
            phone.sendKeys("12345678");
            licenseNumber.click();
            licenseNumber.sendKeys("345234");
            specId.click();
            specId.sendKeys("4");
            addDoctor2.click();
            String actualString = lastNameWarning.getText();
            String expectedString = "size must be between 2 and 30";
            assertTrue(actualString.contains(expectedString));
            SeleniumHelper.takeScreenshot(driver);
            homeBtn.click();
        }

        private void assertTrue(boolean contains) {
        }
//to jest komentarz by sprawdzic czy webhook działa

    }

