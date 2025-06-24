package TestRunner;


import Hooks.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features/Search.feature",glue = {"Steps"}
        ,plugin = {"pretty","html:target/report"})

public class Runner extends TestBase {
}
