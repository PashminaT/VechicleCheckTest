package pages;

import org.openqa.selenium.WebDriver;

/* Base class stores main url and common objects on one page*/

public class VehicleRegistrationBase {

    protected WebDriver driver;

    public VehicleRegistrationBase (WebDriver driver)
    {
        this.driver = driver;
    }
    public VehicleRegistrationBase navigateTo()
    {
        driver.navigate().to("https://covercheck.vwfsinsuranceportal.co.uk/");
        return new VehicleRegistrationBase(driver);
    }
}
