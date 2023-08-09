package com.willysalazar.theinternet.pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

public class WelcomePage {

    SelenideElement titleWelcomePage = $(By.xpath("//h1"));
    SelenideElement subTitleWelcomePage = $(By.xpath("//h2"));
    SelenideElement linkTextABTesting = $(By.linkText("A/B Testing"));


    public String getTitle() {
        return title();
    }

    public String getTextTitleWelcome() {
        return titleWelcomePage.getText();
    }

    public String getTextSubTitleAvailable() {
        return subTitleWelcomePage.getText();
    }

    public void clickLinkABTesting(){
        linkTextABTesting.click();
    }
}
