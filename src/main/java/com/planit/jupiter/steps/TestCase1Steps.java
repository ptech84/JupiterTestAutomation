package com.planit.jupiter.steps;

import com.planit.jupiter.pages.TestCase1Page;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class TestCase1Steps extends ScenarioSteps {

    TestCase1Page testCase1Page;

    @Step("From the home page go to contact page")
    public void from_the_home_page_go_to_contact_page() {
        testCase1Page.from_the_home_page_go_to_contact_page();
    }

    @Step("Populate mandatory fields {0} {1} {2}")
    public void populate_mandatory_fields(String foreName,String email,String message) {
        testCase1Page.populate_mandatory_fields(foreName,email,message);
    }

    @Step("Click submit button")
    public void click_submit_button() {
        testCase1Page.click_submit_button();
    }

    @Step("Validate successful submission message {0}")
    public void validate_successful_submission_message(String foreName) {
        testCase1Page.validate_successful_submission_message(foreName);
    }
}
