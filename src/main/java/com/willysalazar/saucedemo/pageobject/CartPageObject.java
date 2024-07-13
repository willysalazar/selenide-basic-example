package com.willysalazar.saucedemo.pageobject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CartPageObject {
    ElementsCollection cartItemsList = $$("div.cart_item_label");
    SelenideElement checkoutButton = $(By.id("checkout"));
    SelenideElement removeButton = $(By.id("remove-sauce-labs-backpack"));

    public ElementsCollection getCartItemsList(){
        return cartItemsList;
    }

    public CartPageObject checkout(){
        checkoutButton.click();
        return this;
    }

    public void removeItemCart(){
        removeButton.click();
    }








}
