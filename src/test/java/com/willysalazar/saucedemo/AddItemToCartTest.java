package com.willysalazar.saucedemo;

import com.codeborne.selenide.CollectionCondition;
import com.willysalazar.saucedemo.base.BaseConfigSauceDemo;
import com.willysalazar.saucedemo.pageobject.CartPageObject;
import com.willysalazar.saucedemo.pageobject.InventoryPageObject;
import com.willysalazar.saucedemo.pageobject.LoginPageObject;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

@Feature("Add items to cart")
class AddItemToCartTest extends BaseConfigSauceDemo {

    @Test
    @Description("Should add backpack to cart and cart size to be one")
    void shouldAddBackpackToCartAndCartItemsSizeToBeOne() {
        LoginPageObject loginPage = new LoginPageObject();
        loginPage.doLogin("standard_user", "secret_sauce");
        InventoryPageObject inventoryPageObject = new InventoryPageObject();
        inventoryPageObject
                .addBackPackToCart()
                .clickCartButton();
        CartPageObject cartPageObject = new CartPageObject();
        cartPageObject.getCartItemsList()
                .shouldHave(CollectionCondition.size(1));
        cartPageObject.removeItemCart();
    }

}
