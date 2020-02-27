package featurefilerunner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = { "../src/test/java/featuresfile/" },
        glue = { "stepdefination"},
        tags = { "~@ignore"},
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"}


)

public class CucumberRunner {


}
