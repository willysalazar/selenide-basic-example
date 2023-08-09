package com.willysalazar.theinternet.pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicAuthPage {

    SelenideElement textTitletAuthorize = $(By.tagName("h3"));
    SelenideElement textNotAuthorized = $("body");

    public String getTextTitleBasicAuth() {
        return textTitletAuthorize.getText();
    }

    public String getTextNotAuthorizedBasicAuth() {
        return textNotAuthorized.shouldBe(Condition.visible).getText();
    }

    public BasicAuthPage navigateToBasicAuth(String user, String pass){
        WebDriverRunner.getWebDriver().navigate().to("http://" + user + ":" + pass + "@the-internet.herokuapp.com/basic_auth");
        return this;
    }
}
