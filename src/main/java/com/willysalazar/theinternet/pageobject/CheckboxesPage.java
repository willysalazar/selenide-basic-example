package com.willysalazar.theinternet.pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckboxesPage {

    SelenideElement titleCheckboxes = $(By.tagName("h3"));
    SelenideElement checkbox1 = $(By.xpath("//*[@id='checkboxes']/input[1]"));
    SelenideElement checkbox2 = $(By.xpath("//*[@id='checkboxes']/input[2]"));


    public String getTextTitlCheckboxes() {
        return titleCheckboxes.getText();
    }

    public CheckboxesPage selectCheckboxOne(boolean select){
        checkbox1.setSelected(select);
        checkbox1.shouldBe(Condition.selected);
        return this;
    }

    public CheckboxesPage selectCheckboxTwo(boolean select){
        checkbox2.setSelected(select);
        checkbox2.shouldBe(Condition.selected);
        return this;
    }


}
