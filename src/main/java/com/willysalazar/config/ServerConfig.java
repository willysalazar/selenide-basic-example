package com.willysalazar.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:ServerConfig.properties")
public interface ServerConfig extends Config {

    @Key("base.url.theinternet")
    String baseUrlTheInternet();

    @Key("base.url.saucedemo")
    String baseUrlSauceDemo();
}
