package com.willysalazar.saucedemo;

import com.willysalazar.saucedemo.base.BaseConfigSauceDemo;
import com.willysalazar.saucedemo.pageobject.LoginPageObject;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.closeWebDriver;

@Feature("Login")
class LoginParameterizedTest extends BaseConfigSauceDemo {

    public static final String PASSWORD = "secret_sauce";

    @ParameterizedTest
    @ValueSource(strings = {"standard_user", "problem_user", "performance_glitch_user" })
    void shouldHaveLoginWithStandardUser(String user) {
        LoginPageObject loginPage = new LoginPageObject();
        loginPage.doLogin(user, PASSWORD);
        loginPage.title().shouldHave(text("Products"));
    }

    @Test
    void shouldHaveLoginWithLockedOutUser() {
        LoginPageObject loginPage = new LoginPageObject();
        loginPage.doLogin("locked_out_user", PASSWORD);
        loginPage.getErrorUserLocked().shouldHave(text("Epic sadface: Sorry, this user has been locked out."));
    }

    @AfterEach
    void afterLogin(){
        closeWebDriver();
    }
}
