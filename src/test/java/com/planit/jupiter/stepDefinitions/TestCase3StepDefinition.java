package com.planit.jupiter.stepDefinitions;

import com.planit.jupiter.steps.TestCase3Steps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class TestCase3StepDefinition {

    @Steps
    TestCase3Steps testCase3Steps;

    @Then("^Click buy button twice on \"([^\"]*)\"$")
    public void click_buy_button_twice_on(String arg1) {
        testCase3Steps.click_buy_button_twice_on(arg1);
    }

    @Then("^Click buy button five times on \"([^\"]*)\"$")
    public void click_buy_button_five_times_on(String arg1) {
        testCase3Steps.click_buy_button_five_times_on(arg1);
    }

    @Then("^Click buy button thrice on \"([^\"]*)\"$")
    public void click_buy_button_thrice_on(String arg1) {
        testCase3Steps.click_buy_button_thrice_on(arg1);
    }

    @Then("^Verify the subtotal for each product is correct$")
    public void verify_the_subtotal_for_each_product_is_correct() {
        testCase3Steps.verify_the_subtotal_for_each_product_is_correct();
    }


}
