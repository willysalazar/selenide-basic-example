package com.willysalazar.theinternet;

import com.willysalazar.theinternet.base.BaseConfigTheInternet;
import com.willysalazar.theinternet.pageobject.WelcomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WelcomeTest extends BaseConfigTheInternet {

    private WelcomePage welcomePage = new WelcomePage();

    @Test
    public void shouldValidateTitleTheInternet() {
        String title = welcomePage.getTitle();
        Assertions.assertEquals(title, "The Internet");
    }

    @Test
    public void shouldValidateTitleWelcome() {
        String titleWelcome = welcomePage.getTextTitleWelcome();
        Assertions.assertEquals(titleWelcome, "Welcome to the-internet");
    }

    @Test
    public void shouldValidateSubTitleAvailableExamples() {
        String titleWelcome = welcomePage.getTextSubTitleAvailable();
        Assertions.assertEquals(titleWelcome, "Available Examples");

    }
}
