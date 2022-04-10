package com.example.tests;

import com.example.factory.PageFactory;
import com.example.pages.CheckoutCompletePage;
import com.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderTest extends BaseTest {

    private static final String FIRST_NAME = "patrick";
    private static final String LAST_NAME = "balbs";
    private static final String POSTAL_CODE = "3031";

    private static final String CONFIRMATION_MESSAGE = "Checkout: Complete!";

    @Test
    public void orderBackpackTest() {
        driver.get("https://www.saucedemo.com/");

        CheckoutCompletePage checkoutCompletePage = PageFactory.newInstance(LoginPage.class)
                .login("standard_user", "secret_sauce")
                .clickBackpackAddToCartButton()
                .clickShoppingCartButton()
                .clickCheckoutButton()
                .fillCheckoutInformation(FIRST_NAME, LAST_NAME, POSTAL_CODE)
                .clickContinueButton()
                .clickFinishButton();

        String actualMessage = checkoutCompletePage.getConfirmationHeader();

        Assert.assertEquals(CONFIRMATION_MESSAGE, actualMessage);

    }

}
