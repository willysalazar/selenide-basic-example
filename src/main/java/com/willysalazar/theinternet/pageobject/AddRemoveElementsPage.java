package com.willysalazar.theinternet.pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddRemoveElementsPage {


    SelenideElement titleAddRemoveElementsPage = $(By.xpath("//*/h3"));
    SelenideElement linkTextAddRemoveElements = $(By.linkText("Add/Remove Elements"));
    SelenideElement buttonAddElement = $(By.xpath("//*[@id='content']/div/button"));
    SelenideElement buttonDelete = $(By.xpath("//*[@id='elements']/button"));

    public String getTextTitleAddRemoveElements() {
        return titleAddRemoveElementsPage.getText();
    }

    public AddRemoveElementsPage clickLinkAddRemoveElements(){
        linkTextAddRemoveElements.click();
        return this;
    }

    public AddRemoveElementsPage addElements(){
        buttonAddElement.click();
        return this;
    }

    public AddRemoveElementsPage deleteElements(){
        buttonDelete.click();
        return this;
    }
}
