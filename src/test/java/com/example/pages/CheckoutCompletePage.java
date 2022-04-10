package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage {

    @FindBy(css="#header_container span")
    private WebElement confirmationHeaderLabel;

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }

    public String getConfirmationHeader() {
        return confirmationHeaderLabel.getAttribute("innerHTML");
    }

}
