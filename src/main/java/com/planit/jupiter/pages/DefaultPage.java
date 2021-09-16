package com.planit.jupiter.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://jupiter.cloud.planittesting.com")
public class DefaultPage extends PageObject {


    public void launch_the_Jupiter_application() {
        open();
    }
}
