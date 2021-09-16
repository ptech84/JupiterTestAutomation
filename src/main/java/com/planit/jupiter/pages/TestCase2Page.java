package com.planit.jupiter.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.NoSuchElementException;

public class TestCase2Page extends PageObject {

    @FindBy(xpath = "//*[@class='nav']/li[@id='nav-shop']/a")
    private WebElementFacade shopLink;

    @FindBy(xpath = "//a[@href='#/cart']")
    private WebElementFacade cartLink;

    public void from_the_home_page_go_to_shop_page() {
        waitFor(shopLink).waitUntilClickable().click();
    }

    public void click_buy_button_twice_on(String arg1) {
        find(By.xpath("//h4[text()='" + arg1 + "']/parent::div/p/a")).click();
        find(By.xpath("//h4[text()='" + arg1 + "']/parent::div/p/a")).click();
    }

    public void click_buy_button_once_on(String arg1) {
        find(By.xpath("//h4[text()='" + arg1 + "']/parent::div/p/a")).click();
    }

    public void click_the_cart_menu() {
        waitFor(cartLink).waitUntilClickable().click();
    }

    public void verify_the_items_are_in_the_cart() {
        List<WebElementFacade> listOfItems = findAll(By.xpath("//*[@name='form']/table/tbody/tr"));


        for (int i = 0; i < listOfItems.size(); i++) {
            int j = i + 1;
            String value = find(By.xpath("//*[@name='form']/table/tbody/tr[" + j + "]/td[1]")).getText();

            switch (value.trim()) {

                case "Funny Cow":
                    Assert.assertTrue(find(By.xpath("//*[@name='form']/table/tbody/tr/td[contains(text(),'Funny Cow')]")).isDisplayed());
                    break;
                case "Fluffy Bunny":
                    Assert.assertTrue(find(By.xpath("//*[@name='form']/table/tbody/tr/td[contains(text(),'Fluffy Bunny')]")).isDisplayed());
                    break;

                default:
                    throw new NoSuchElementException("Items not in the cart");
            }


        }

    }
}
