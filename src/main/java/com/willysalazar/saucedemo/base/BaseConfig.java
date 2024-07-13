package com.willysalazar.saucedemo.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.willysalazar.config.ServerConfig;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;

public abstract class BaseConfig {

    @BeforeAll
    public static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                        .screenshots(true)
                        .savePageSource(true));
    }

    @BeforeEach
    public void preConditions(){
        ServerConfig serverConfig = ConfigFactory.create(ServerConfig.class);
        Configuration.browser = "firefox";
        open(serverConfig.baseUrlSauceDemo());
    }

    @AfterAll
    public static void logout() {
        clearBrowserCookies();
        closeWebDriver();
    }
}
