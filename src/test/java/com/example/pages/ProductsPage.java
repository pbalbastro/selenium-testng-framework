package com.example.pages;

import com.example.factory.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

    @FindBy(css="#add-to-cart-sauce-labs-backpack")
    private WebElement backpackAddToCartButton;

    @FindBy(css="#shopping_cart_container a")
    private WebElement shoppingCartButton;


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public ProductsPage clickBackpackAddToCartButton() {
        backpackAddToCartButton.click();
        return this;
    }

    public CartPage clickShoppingCartButton() {
        shoppingCartButton.click();
        return PageFactory.newInstance(CartPage.class);

    }





}
