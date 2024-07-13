package com.willysalazar.saucedemo.pageobject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByAttribute;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CheckoutPageObject {
    SelenideElement fieldFirstName = $(By.id("first-name"));
    SelenideElement fieldLastName = $(By.id("last-name"));
    SelenideElement fieldPostalCode = $(By.id("postal-code"));
    SelenideElement buttonContinue = $(By.id("continue"));
    ElementsCollection summaryInfo = $$("div.summary_info");
    ElementsCollection cartItemsList = $$("div.cart_item_label");
    SelenideElement buttonFinish = $("[data-test^='finish']");
    SelenideElement completeText = $("h2.complete-header");
    SelenideElement buttonBackHome = $(By.id("back-to-products"));



//    public SelenideElement title(){
//        return $("[data-test^='title']");
//    }

    public CheckoutPageObject filledBasicInformation(){
        fieldFirstName.setValue("Daft").pressTab();
        fieldLastName.setValue("Punk").pressTab();
        fieldPostalCode.setValue("9001277");
        return this;
    }

    public void continueCheckout(){
        buttonContinue.click();
    }

    public ElementsCollection getSummaryInfo(){
        return summaryInfo;
    }
    public ElementsCollection getCartItemsList(){
        return cartItemsList;
    }
    public CheckoutPageObject finish(){
        buttonFinish.click();
        return this;
    }
    public SelenideElement getCheckoutCompleteMsg(){
        return completeText;
    }
    public void backHome(){
        buttonBackHome.click();
    }







}
