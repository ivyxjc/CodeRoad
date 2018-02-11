package xyz.ivyxjc.stepDefinition;

import cucumber.api.java8.En;
import org.junit.Assert;
import xyz.ivyxjc.utils.Calculator;

public class CalculatorStepdefs implements En {
    Calculator mCalculator;

    public CalculatorStepdefs() {
        Given("^two numbers \"([^\"]*)\" and \"([^\"]*)\"$", (String arg1, String arg2) -> {
            // Write code here that turns the phrase above into concrete actions
            mCalculator = new Calculator(Integer.parseInt(arg1), Integer.parseInt(arg2));
        });

        When("^the calculator is running$", () -> {
            // Write code here that turns the phrase above into concrete actions
            mCalculator.calculate();
        });

        Then("^the output is \"([^\"]*)\"$", (String arg1) -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(mCalculator.getTotal().intValue(), Integer.parseInt(arg1));
        });
    }
}
