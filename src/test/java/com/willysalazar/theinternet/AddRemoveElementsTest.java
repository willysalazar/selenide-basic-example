package com.willysalazar.theinternet;

import com.willysalazar.theinternet.base.BaseConfigTheInternet;
import com.willysalazar.theinternet.pageobject.AddRemoveElementsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class AddRemoveElementsTest extends BaseConfigTheInternet {

    @Test
    public void shouldValidateAddAndRemoveElements(){
        AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage();
        open("add_remove_elements/");
        String textTitleAddRemoveElements =
                addRemoveElementsPage.
                        addElements().
                        deleteElements().
                        getTextTitleAddRemoveElements();
        Assertions.assertEquals("Add/Remove Elements", textTitleAddRemoveElements);
    }
}
