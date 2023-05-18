package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

plugin = {},
features = "src/test/resources/features",
glue  = {"steps"},
tags = {"~@ignore"}
)

public class RunTest {
}
