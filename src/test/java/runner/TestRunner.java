package runner;


import base.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefs",
        tags = "@wishListTab"
)
public class TestRunner extends TestBase {
}
