package com.example.pages;

import com.example.factory.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutInformationPage extends BasePage {

    @FindBy(css="#first-name")
    private WebElement firstNameTextbox;

    @FindBy(css="#last-name")
    private WebElement lastNameTextbox;

    @FindBy(css="#postal-code")
    private WebElement postalCodeTextbox;

    @FindBy(css="#continue")
    private WebElement continueButton;


    public CheckoutInformationPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutInformationPage fillCheckoutInformation (String firstName, String lastName, String postalCode) {
        firstNameTextbox.sendKeys(firstName);
        lastNameTextbox.sendKeys(lastName);
        postalCodeTextbox.sendKeys(postalCode);
        return this;
    }

    public CheckoutOverviewPage clickContinueButton() {
        continueButton.click();
        return PageFactory.newInstance(CheckoutOverviewPage.class);

    }


}
