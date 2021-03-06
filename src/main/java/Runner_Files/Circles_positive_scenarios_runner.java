package Runner_Files;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = "src\\main\\java\\Circles_positive_scenarios\\Circles_positive_scenarios.feature",
		glue= {"Circles_positive_scenarios"},
		monochrome = true
		,publish = true
       	)
public class Circles_positive_scenarios_runner extends AbstractTestNGCucumberTests {

}
