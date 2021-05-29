package com.willysalazar.base;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;

public abstract class BaseConfig {

    @BeforeEach
    public void preConditions(){
        open("https://www.saucedemo.com/");
    }


    @AfterAll
    public static void logout() {
        closeWebDriver();
    }
}
