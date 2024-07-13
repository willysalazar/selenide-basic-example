package com.willysalazar.saucedemo;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.willysalazar.saucedemo.base.BaseConfig;
import com.willysalazar.saucedemo.pageobject.CartPageObject;
import com.willysalazar.saucedemo.pageobject.CheckoutPageObject;
import com.willysalazar.saucedemo.pageobject.InventoryPageObject;
import com.willysalazar.saucedemo.pageobject.LoginPageObject;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.screenshot;


@Feature("Checkout item to finish")
public class CheckoutCompleteTest extends BaseConfig {

    @Test
    @Description("Should checkout complete - Information, Overview and Complete Steps")
    void shouldCheckoutItemComplete() {
        LoginPageObject loginPage = new LoginPageObject();
        InventoryPageObject inventoryPageObject = new InventoryPageObject();
        CartPageObject cartPageObject = new CartPageObject();
        CheckoutPageObject checkoutPageObject = new CheckoutPageObject();

        loginPage.doLogin("standard_user", "secret_sauce");
        inventoryPageObject
                .addBackPackToCart()
                .clickCartButton();
        cartPageObject.getCartItemsList()
                .shouldHave(CollectionCondition.size(1));
        cartPageObject.checkout();
        checkoutPageObject
                .filledBasicInformation()
                .continueCheckout();
        checkoutPageObject.getSummaryInfo()
                .shouldHave(CollectionCondition
                        .texts("Payment Information:\n"
                                +"SauceCard #31337\n"
                                +"Shipping Information:\n"
                                +"Free Pony Express Delivery!\n"
                                +"Price Total\n"
                                +"Item total: $29.99\n"
                                +"Tax: $2.40\n"
                                +"Total: $32.39\n"
                                +"Cancel\n"
                                +"Finish"));
        checkoutPageObject.getCartItemsList()
                .shouldHave(CollectionCondition
                        .size(1));
        screenshot("summary-item");
        checkoutPageObject.finish()
                .getCheckoutCompleteMsg()
                .shouldHave(Condition.text("Thank you for your order!"));
        screenshot("checkout-complete");
        checkoutPageObject.backHome();

    }


}
