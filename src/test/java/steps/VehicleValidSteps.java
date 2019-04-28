package steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.VehicleRegistrationBase;
import pages.VehicleRegistrationCheck;

public class VehicleValidSteps {

    WebDriver driver;
    VehicleRegistrationBase vehicleReg;
    VehicleRegistrationCheck user;
    protected static String OS;

    @Given("^the user is on vehicle registartion website$")
    public void theUserIsOnVehicleRegistartionWebsite() {
        vehicleReg = new VehicleRegistrationBase(driver);
        vehicleReg.navigateTo();
    }

    @When("^user enters valid registartion$")
    public void userEntersValidRegistartion() {
        user = new VehicleRegistrationCheck(driver);
        user.enterValidRegistration();
    }

    @When("^user enters invalid registartion$")
    public void userEntersInvalidRegistartion() {
        user = new VehicleRegistrationCheck(driver);
        user.enterInvalidRegistration();
    }

    @When("^user leaves registartion blank$")
    public void userLeavesRegistartionBlank() {
        user = new VehicleRegistrationCheck(driver);
        user.leavesRegistrationBlank();
    }

    @Then("^details of insurance are displayed$")
    public void detailsOfInsuranceAreDisplayed() throws InterruptedException {
        user.getsDetailsOfVehicle();
    }

    @Then("^\"([^\"]*)\" message is displayed$")
    public void messageIsDisplayed(String arg0) throws Throwable {
        user.getsDetailsOfInvalidVehicle(arg0);
    }

    @Then("^message to enter details is displayed$")
    public void messageToEnterDetailsIsDisplayed() {
        user.enterDetailsIsDisplayed();
    }

    @Before
    public void setUp() {
        OS = System.getProperty("os.name").toLowerCase();

        if (OS.contains("windows")) {
            if (System.getProperty("webdriver.chrome.driver") == null) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
            }
        } else {
            if (System.getProperty("webdriver.chrome.driver") == null) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver");
            }

            driver = new ChromeDriver();
        }
    }

    @After
    public void tearDown() {
        driver.close();
    }


}

