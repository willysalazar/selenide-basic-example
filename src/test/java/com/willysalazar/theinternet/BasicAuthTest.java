package com.willysalazar.theinternet;

import com.willysalazar.theinternet.base.BaseConfigTheInternet;
import com.willysalazar.theinternet.pageobject.BasicAuthPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class BasicAuthTest extends BaseConfigTheInternet {

    @Test
    public void shouldValidateBasicAuth_Authorized(){
        BasicAuthPage basicAuthPage = new BasicAuthPage();
        open("basic_auth");
        String titlePageAuthorized =
                basicAuthPage.
                        navigateToBasicAuth("admin", "admin").
                        getTextTitleBasicAuth();
        Assertions.assertEquals("Basic Auth", titlePageAuthorized);
    }

    @Disabled
    @Test
    //TODO need to update
    public void shouldValidateBasicAuth_NotAuthorized(){
        BasicAuthPage basicAuthPage = new BasicAuthPage();
        open("basic_auth");
        String titlePageNotAuthorized =
                basicAuthPage.
                        navigateToBasicAuth("admin", "123").
                        getTextNotAuthorizedBasicAuth();
        Assertions.assertEquals("Not Authorized", titlePageNotAuthorized);
    }
}
