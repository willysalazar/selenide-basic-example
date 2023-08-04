package com.willysalazar.theinternet;

import com.willysalazar.theinternet.base.BaseConfigTheInternet;
import com.willysalazar.theinternet.pageobject.AddRemoveElementsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddRemoveElementsTest extends BaseConfigTheInternet {

    @Test
    public void shouldValidateAddAndRemoveElements(){
        AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage();
        String textTitleAddRemoveElements =
                addRemoveElementsPage.
                        clickLinkAddRemoveElements().
                        addElements().
                        deleteElements().
                        getTextTitleAddRemoveElements();
        Assertions.assertEquals(textTitleAddRemoveElements,textTitleAddRemoveElements);
    }
}
