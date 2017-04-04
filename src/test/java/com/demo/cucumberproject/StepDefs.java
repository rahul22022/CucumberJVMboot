package com.demo.cucumberproject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

/**
 * Created by rparashar on 4/4/17.
 */
public class StepDefs {
    int sum =0;
    @Given("^calculator is implemented$")
    public void calculator_is_implemented() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(1,1);
    }

    @When("^we pass (.*) and (.*) to the calculator$")
    public void we_pass_and_to_the_calculator(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sum = arg1 + arg2;
    }

    @Then("^sum is displayed as (.*)$")
    public void sum_is_displayed_as(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(sum,arg1);
    }

}
