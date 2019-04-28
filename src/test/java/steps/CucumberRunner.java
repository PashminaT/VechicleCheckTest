package steps;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author Pashmina Tiwari
 */

@CucumberOptions( plugin ={"pretty", "html:target/cucumber-html-report"},
    features = "src/test/resources")
@RunWith(Cucumber.class)
public class CucumberRunner
{
}
