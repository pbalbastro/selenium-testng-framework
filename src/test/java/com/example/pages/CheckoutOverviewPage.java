package com.example.pages;

import com.example.factory.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage extends BasePage {

    @FindBy(css="#finish")
    private WebElement finishButton;

    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutCompletePage clickFinishButton() {
        finishButton.click();
        return PageFactory.newInstance(CheckoutCompletePage.class);
    }
}
