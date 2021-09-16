package com.planit.jupiter.runner;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "classpath:features",
        glue = {"com.planit.jupiter.stepDefinitions"},
        plugin = {"json:target/cucumber-reports/cucumber-reports.json",
                "html:target/cucumber-reports/cucumber-reports.html",
        },
        dryRun = false,
        monochrome = true)
public class CucumberRunner {
}
