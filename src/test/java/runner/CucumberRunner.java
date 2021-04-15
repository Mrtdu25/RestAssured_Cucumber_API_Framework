package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "rerun:target/rerun.txt",
                "de.monochromata.cucumber.report.PrettyReports:target/cucumber",
                "junit:target/cucumber-reports/Cucumber.xml ",
                "junit:target/cucumber-reports/Cucumber.json",
                "pretty", "html:target/cucumber/report.html",

        },

        features = "src/test/resources/Features/GET.feature",
        glue = "stepDefinitions",
        //monochrome = true,
        dryRun = false,
        tags = "@GET_Request",
        publish = true
)

public class CucumberRunner {

}
