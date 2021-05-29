package com.willysalazar.pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class LoginPageObject {
    private SelenideElement username() {
        return $("#user-name"); // Waits until element gets text
    }
    private SelenideElement password() {
        return $("#password"); // Waits until element gets text
    }
    private SelenideElement loginButton() {
        return $("#login-button"); // Waits until element gets text
    }
    public SelenideElement title() {
        return $("div>span.title"); // Waits until element gets text
    }
    public SelenideElement errorUserLocked() {
        return $("div>h3"); // Waits until element gets text
    }

    public void doLogin(String user, String pass){
        username().sendKeys(user);
        password().sendKeys(pass);
        loginButton().pressEnter();
    }







}
