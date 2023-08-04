package com.willysalazar.theinternet;

import com.willysalazar.theinternet.base.BaseConfigTheInternet;
import com.willysalazar.theinternet.pageobject.AbPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AbTest extends BaseConfigTheInternet {

    private static final String TITLE_AB_EXPECTED= "A/B Test";

    @Test
    public void shouldValidateABTest(){
        AbPage abPage = new AbPage();
        String textTitleAb = abPage.clickLinkABTesting().getTextTitleAB();
        Assertions.assertTrue(textTitleAb.startsWith(TITLE_AB_EXPECTED));
    }
}
