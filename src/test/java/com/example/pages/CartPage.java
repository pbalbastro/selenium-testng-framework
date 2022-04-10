package com.example.pages;

import com.example.factory.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(css="#checkout")
    private WebElement checkoutButton;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutInformationPage clickCheckoutButton() {
        checkoutButton.click();
        return PageFactory.newInstance(CheckoutInformationPage.class);
    }


}
