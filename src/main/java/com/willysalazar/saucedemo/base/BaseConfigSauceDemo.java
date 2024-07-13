package com.willysalazar.saucedemo.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.willysalazar.base.BaseConfig;
import com.willysalazar.config.ServerConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeEach;
import static com.codeborne.selenide.Selenide.open;

public abstract class BaseConfigSauceDemo extends BaseConfig {

    @BeforeEach
    public void preConditions(){
        ServerConfig serverConfig = ConfigFactory.create(ServerConfig.class);
        Selenide.clearBrowserCookies();
        Configuration.browser = "firefox";
        open(serverConfig.baseUrlSauceDemo());
    }

}
