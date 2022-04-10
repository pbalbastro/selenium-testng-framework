package com.example.tests;

import com.example.factory.PageFactory;
import com.example.pages.LoginPage;
import com.example.pages.ProductsPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest() {
        driver.get("https://www.saucedemo.com/");

        ProductsPage productsPage = PageFactory.newInstance(LoginPage.class)
                .setUsernameInput("standard_user")
                .setPasswordInput("secret_sauce");
    }
}
