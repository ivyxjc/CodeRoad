package xyz.ivyxjc;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"html:target/html"}
        , features = {"src/main/resources/Iteration1/Story123456_TS1_TC1.feature"}
        , glue = {"io.cucumber.samples.dw.steps"}
)
public class AppTest {
}
