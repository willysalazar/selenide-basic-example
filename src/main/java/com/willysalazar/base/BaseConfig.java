package com.willysalazar.base;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public abstract class BaseConfig {

    @BeforeAll
    public static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                        .screenshots(true)
                        .savePageSource(true));
    }

    @AfterAll
    public static void logout() {
        closeWebDriver();
    }
}
