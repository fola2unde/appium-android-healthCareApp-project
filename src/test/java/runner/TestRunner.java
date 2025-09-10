package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinitions"},
        plugin = {
                "pretty",                                  // readable console output
                "summary",                                 // concise execution summary
                "html:target/cucumber-report.html",        // HTML report
                "json:target/cucumber-report.json"         // JSON report (can be used with Allure)
        },
        tags = "@smoke or @regression", // <-- include only scenarios tagged @smoke or @regression
        monochrome = false               // cleaner console output
)
public class TestRunner {
}
