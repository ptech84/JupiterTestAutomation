package com.planit.jupiter.stepDefinitions;

import com.planit.jupiter.steps.DefaultSteps;
import com.planit.jupiter.steps.TestCase1Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class TestCase1StepDefinition {


    @Steps
    TestCase1Steps testCase1Steps;

    @Steps
    DefaultSteps defaultSteps;


    @Given("^Launch the Jupiter application$")
    public void launch_the_Jupiter_application() {
        defaultSteps.launch_the_Jupiter_application();
    }


    @Given("^From the home page go to contact page$")
    public void from_the_home_page_go_to_contact_page() {
        testCase1Steps.from_the_home_page_go_to_contact_page();
    }

    @Then("^Populate mandatory fields \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void populate_mandatory_fields(String foreName, String email, String message) {
        testCase1Steps.populate_mandatory_fields(foreName,email,message);
    }

    @Then("^Click submit button$")
    public void click_submit_button() {
        testCase1Steps.click_submit_button();
    }

    @Then("^Validate successful submission message \"([^\"]*)\"$")
    public void validate_successful_submission_message(String foreName) {
        testCase1Steps.validate_successful_submission_message(foreName);

    }

}
