package xyz.ivyxjc;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"html:target/html"}
        , features = {"src/main/resources/Iteration1/Calculator.feature"}
        , glue = {"xyz.ivyxjc.stepDefinition"}
)
public class AppTest {
}
