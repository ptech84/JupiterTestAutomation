package com.planit.jupiter.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

public class TestCase1Page extends PageObject {

    @FindBy(xpath = "//a[@href='#/contact']")
    private WebElementFacade contactLink;

    @FindBy(xpath = "//strong[text()='We welcome your feedback']")
    private WebElementFacade verifyContactPageTitle;

    @FindBy(id = "forename")
    private WebElementFacade foreNameTxt;

    @FindBy(id = "email")
    private WebElementFacade emailTxt;

    @FindBy(id = "message")
    private WebElementFacade messageTxt;

    @FindBy(xpath = "//a[text()='Submit']")
    private WebElementFacade submitBtn;

    @FindBy(xpath = "//*[@class='alert alert-success']")
    private WebElementFacade successAlertMessage;


    public void from_the_home_page_go_to_contact_page() {
        waitFor(contactLink).waitUntilClickable().click();
    }

    public void populate_mandatory_fields(String foreName, String email, String message) {
        boolean flag = waitFor(verifyContactPageTitle).waitUntilPresent().isPresent();
        if (flag) {
            waitFor(foreNameTxt).type(foreName);
            waitFor(emailTxt).type(email);
            waitFor(messageTxt).type(message);
        }

    }

    public void click_submit_button() {
        waitFor(submitBtn).waitUntilClickable().click();
    }

    public void validate_successful_submission_message(String foreName) {
        WebDriverWait wb = new WebDriverWait(getDriver(),60);
        wb.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='alert alert-success']")
        ));
        boolean flag = waitFor(successAlertMessage).waitUntilPresent().isPresent();
        if (flag) {
            String actualMessage = find(By.xpath("//strong")).getText();
            Assert.assertEquals("Forename is not matching", "Thanks " + foreName, actualMessage);
        } else {
            throw new NoSuchElementException("Failed to display success submission message");
        }

    }
}
