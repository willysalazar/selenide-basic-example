package com.willysalazar.theinternet.pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AbPage {

    SelenideElement titleAbPage = $(By.tagName("h3"));

    public String getTextTitleAB() {
        return titleAbPage.getText();
    }

}
