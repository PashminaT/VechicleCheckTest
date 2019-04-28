package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.TestCase.assertEquals;

public class VehicleRegistrationCheck extends VehicleRegistrationBase {
    public VehicleRegistrationCheck(WebDriver driver) {
        super(driver);
    }

    public void getsDetailsOfVehicle() throws InterruptedException {
        driver.findElement(By.cssSelector("[name] span")).click();
        WebElement result = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".result")));
        assertEquals("Result for : OV12UYY",(result.getText()));
        assertEquals("Cover start:  09 FEB 2022 : 16 : 26",(driver.findElement(By.cssSelector("#page-container div:nth-of-type(4) .resultDate-bold:nth-of-type(2)")).getText()));
        assertEquals("Cover end:    18 FEB 2022 : 23 : 59",(driver.findElement(By.cssSelector("#page-container div:nth-of-type(4) .resultDate-bold:nth-of-type(3)")).getText()));
    }

    public void enterValidRegistration() {
       driver.findElement(By.cssSelector("input")).clear();
        driver.findElement(By.cssSelector("input")).sendKeys("OV12UYY");
    }

    public void getsDetailsOfInvalidVehicle(String message) {
        driver.findElement(By.cssSelector("[name] span")).click();
        WebElement result = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".result")));
        assertEquals(message,(result.getText()));
    }

    public void enterInvalidRegistration() {
        driver.findElement(By.cssSelector("input")).clear();
        driver.findElement(By.cssSelector("input")).sendKeys("OV12UY");
    }

    public void leavesRegistrationBlank() {
        driver.findElement(By.cssSelector("input")).clear();
    }

    public void enterDetailsIsDisplayed() {
        driver.findElement(By.cssSelector("[name] span")).click();
        WebElement result = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".error-required")));
        assertEquals("Please enter a valid car registration",(result.getText()));
    }
}
