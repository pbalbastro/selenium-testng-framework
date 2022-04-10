package com.example.pages;

import com.example.factory.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css="#user-name")
    private WebElement usernameInput;

    @FindBy(css="#password")
    private WebElement passwordInput;

    @FindBy(css="#login-button")
    private WebElement loginButton;

    /**
     * Instantiates a new login page.
     *
     * @param driver the driver
     */
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setUsernameInput(String username) {
        usernameInput.sendKeys(username);
        return this;
    }

    public ProductsPage setPasswordInput(String password) {
        passwordInput.sendKeys(password);
        return PageFactory.newInstance(ProductsPage.class);
    }

    public ProductsPage login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
        return PageFactory.newInstance(ProductsPage.class);

    }

}
