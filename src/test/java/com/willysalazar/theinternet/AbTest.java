package com.willysalazar.theinternet;

import com.willysalazar.theinternet.base.BaseConfigTheInternet;
import com.willysalazar.theinternet.pageobject.AbPage;
import com.willysalazar.theinternet.pageobject.WelcomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbTest extends BaseConfigTheInternet {

    @Test
    public void shouldValidateABTest(){
        AbPage abPage = new AbPage();
        open("/abtest");
        String textTitleAb = abPage.getTextTitleAB();
        Assertions.assertTrue(textTitleAb.contains("A/B Test"));
    }
}
