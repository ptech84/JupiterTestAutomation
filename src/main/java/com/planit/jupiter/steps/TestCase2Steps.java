package com.planit.jupiter.steps;

import com.planit.jupiter.pages.TestCase2Page;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class TestCase2Steps extends ScenarioSteps {

    TestCase2Page testCase2Page;


    @Step("From the home page go to shop page")
    public void from_the_home_page_go_to_shop_page() {
        testCase2Page.from_the_home_page_go_to_shop_page();
    }

    @Step("Click buy button twice on {0}")
    public void click_buy_button_twice_on(String arg1) {
        testCase2Page.click_buy_button_twice_on(arg1);
    }

    @Step("Click buy button once on {0}")
    public void click_buy_button_once_on(String arg1) {
        testCase2Page.click_buy_button_once_on(arg1);
    }

    @Step("Click the cart menu")
    public void click_the_cart_menu() {
        testCase2Page.click_the_cart_menu();
    }

    @Step("Verify the items are in the cart")
    public void verify_the_items_are_in_the_cart() {
        testCase2Page.verify_the_items_are_in_the_cart();
    }
}
