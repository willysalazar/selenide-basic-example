package com.willysalazar.theinternet.pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AbPage {

    SelenideElement linkTextABTesting = $(By.linkText("A/B Testing"));
    SelenideElement titleAbPage = $(By.xpath("//*[@id='content']/div/h3"));

    public String getTextTitleAB() {
        return titleAbPage.getText();
    }

    public AbPage clickLinkABTesting(){
        linkTextABTesting.click();
        return this;
    }
}
