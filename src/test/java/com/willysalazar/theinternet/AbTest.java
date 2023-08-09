package com.willysalazar.theinternet;

import com.willysalazar.theinternet.base.BaseConfigTheInternet;
import com.willysalazar.theinternet.pageobject.AbPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbTest extends BaseConfigTheInternet {

    @Test
    public void shouldValidateABTest(){
        AbPage abPage = new AbPage();
        String textTitleAb = abPage
                .clickLinkABTesting()
                .getTextTitleAB();
        Assertions.assertTrue(textTitleAb.startsWith("A/B Test"));
    }
}
