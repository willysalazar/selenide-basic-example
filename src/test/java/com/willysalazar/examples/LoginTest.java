package com.willysalazar.examples;

import com.willysalazar.base.BaseConfig;
import com.willysalazar.pageobject.LoginPageObject;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;

public class LoginTest extends BaseConfig {

    @Test
    public void shouldHaveLoginWithStandardUser() {
        LoginPageObject loginPage = new LoginPageObject();
        loginPage.doLogin("standard_user", "secret_sauce");
        loginPage.title().shouldHave(text("Products"));
    }

    @Test
    public void shouldHaveLoginWithProblemUser() {
        LoginPageObject loginPage = new LoginPageObject();
        loginPage.doLogin("problem_user", "secret_sauce");
        loginPage.title().shouldHave(text("Products"));
    }

    @Test
    public void shouldHaveLoginWithPerformanceGlitchUser() {
        LoginPageObject loginPage = new LoginPageObject();
        loginPage.doLogin("performance_glitch_user", "secret_sauce");
        loginPage.title().shouldHave(text("Products"));
    }

    @Test
    public void shouldHaveLoginWithLockedOutUser() {
        LoginPageObject loginPage = new LoginPageObject();
        loginPage.doLogin("locked_out_user", "secret_sauce");
        loginPage.errorUserLocked().shouldHave(text("Epic sadface: Sorry, this user has been locked out."));
    }


}
