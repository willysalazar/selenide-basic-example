package com.willysalazar.theinternet;

import com.willysalazar.theinternet.base.BaseConfigTheInternet;
import com.willysalazar.theinternet.pageobject.BasicAuthPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicAuthTest extends BaseConfigTheInternet {

    @Test
    public void shouldValidateBasicAuth(){
        BasicAuthPage basicAuthPage = new BasicAuthPage();
        String titlePageAuthorized =
                basicAuthPage.
                        clickLinkBasicAuth().
                        navigateToBasicAuth("admin", "admin").
                        getTextTitleBasicAuth();
        Assertions.assertEquals("Basic Auth", titlePageAuthorized);
    }
}
