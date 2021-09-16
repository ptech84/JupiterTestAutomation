package com.planit.jupiter.stepDefinitions;

import com.planit.jupiter.steps.TestCase2Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class TestCase2StepDefinition {

    @Steps
    TestCase2Steps testCase2Steps;


    @Given("^From the home page go to shop page$")
    public void from_the_home_page_go_to_shop_page() {
        testCase2Steps.from_the_home_page_go_to_shop_page();
    }

    @Then("^Click buy button twice on “(.*)”$")
    public void click_buy_button_twice_on(String arg1) {
        testCase2Steps.click_buy_button_twice_on(arg1);
    }

    @Then("^Click buy button once on “(.*)”$")
    public void click_buy_button_once_on(String arg1) {
        testCase2Steps.click_buy_button_once_on(arg1);
    }


    @Then("^Click the cart menu$")
    public void click_the_cart_menu() {
        testCase2Steps.click_the_cart_menu();
    }

    @Then("^Verify the items are in the cart$")
    public void verify_the_items_are_in_the_cart() {
        testCase2Steps.verify_the_items_are_in_the_cart();
    }


}
