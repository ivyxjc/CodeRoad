package xyz.ivyxjc.stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class FixedAmountWithdrawStepdefs implements En {
    public FixedAmountWithdrawStepdefs() {
        And("^My balance is \"([^\"]*)\"元$", (String arg0) -> {
            // Write code here that turns the phrase above into concrete actions

            throw new PendingException();
        });
        Given("^My account has balance \"([^\"]*)\"元$", (String arg0) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        When("^Withdraw Amount \"([^\"]*)\"元$", (String arg0) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
        Then("^I get cash \"([^\"]*)\"元$", (String arg0) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
    }


}
