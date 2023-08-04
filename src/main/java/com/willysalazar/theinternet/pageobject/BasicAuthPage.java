package com.willysalazar.theinternet.pageobject;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicAuthPage {

    SelenideElement textNotAuthorize = $(By.xpath("/html/body/pre"));
    SelenideElement textTitletAuthorize = $(By.xpath("//*[@id='content']/div/h3"));
    SelenideElement linkTextBasicAuth = $(By.linkText("Basic Auth"));

    public String getTextNotAuthorize() {
        return textNotAuthorize.getText();
    }

    public String getTextTitleBasicAuth() {
        return textTitletAuthorize.getText();
    }

    public BasicAuthPage clickLinkBasicAuth(){
        linkTextBasicAuth.click();
        return this;
    }

    public BasicAuthPage navigateToBasicAuth(String user, String pass){
        WebDriverRunner.getWebDriver().navigate().to("http://" + user + ":" + user + "@the-internet.herokuapp.com/basic_auth");
        return this;
    }
}
