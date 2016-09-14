package org.alfresco.po.common;

import org.alfresco.helper.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by p3700471 on 14/09/16.
 */
public class LoginPO extends Utils{

    @FindBy(id = "page_x002e_components_x002e_slingshot-login_x0023_default-username")
    private WebElement loginUsernameTextfield;

    @FindBy(id = "page_x002e_components_x002e_slingshot-login_x0023_default-password")
    private WebElement loginPasswordTextfield;

    @FindBy(id = "page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")
    private WebElement loginButton;

    public void enterUserName()
    {
        loginUsernameTextfield.sendKeys(GetProperty("credentials.properties","alfrescoUserName"));
    }

    public void enterPassword()
    {
        loginPasswordTextfield.sendKeys(GetProperty("credentials.properties","alfrescoPassword"));
    }

    public void clickLoginButton()
    {
        loginButton.click();
    }
}
