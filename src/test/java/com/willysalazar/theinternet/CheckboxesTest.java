package com.willysalazar.theinternet;

import com.willysalazar.theinternet.base.BaseConfigTheInternet;
import com.willysalazar.theinternet.pageobject.AddRemoveElementsPage;
import com.willysalazar.theinternet.pageobject.CheckboxesPage;
import com.willysalazar.theinternet.pageobject.WelcomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class CheckboxesTest extends BaseConfigTheInternet {


    @Test
    public void shouldValidateCheckboxes(){
        open("/checkboxes");
        CheckboxesPage checkboxesPage = new CheckboxesPage();
        String textTitleCheckboxes =
                checkboxesPage.
                        clickCheckboxOne().
                        clickCheckboxTwo().
                        getTextTitlCheckboxes();
        Assertions.assertEquals("Checkboxes",textTitleCheckboxes);
    }

}
