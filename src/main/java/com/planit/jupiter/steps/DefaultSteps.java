package com.planit.jupiter.steps;

import com.planit.jupiter.pages.DefaultPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DefaultSteps extends ScenarioSteps {

    DefaultPage defaultPage;

    @Step("Launch the Jupiter application")
    public void launch_the_Jupiter_application() {
        defaultPage.launch_the_Jupiter_application();

    }
}
