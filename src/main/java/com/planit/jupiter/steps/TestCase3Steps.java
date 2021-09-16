package com.planit.jupiter.steps;

import com.planit.jupiter.pages.TestCase3Page;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class TestCase3Steps extends ScenarioSteps {

    TestCase3Page testCase3Page;

    @Step("Click buy button twice on  {0}")
    public void click_buy_button_twice_on(String arg1) {
        testCase3Page.click_buy_button_twice_on(arg1);
    }

    @Step("Click buy button thrice on {0}")
    public void click_buy_button_thrice_on(String arg1) {
        testCase3Page.click_buy_button_thrice_on(arg1);
    }

    @Step("Click buy button five times on {0}")
    public void click_buy_button_five_times_on(String arg1) {
        testCase3Page.click_buy_button_five_times_on(arg1);
    }

    @Step("Verify the subtotal for each product is correct")
    public void verify_the_subtotal_for_each_product_is_correct() {
        testCase3Page.verify_the_subtotal_for_each_product_is_correct();
    }


}
