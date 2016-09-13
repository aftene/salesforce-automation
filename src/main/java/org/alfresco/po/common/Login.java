package org.alfresco.po.common;

import org.alfresco.helper.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by p3700509 on 06/09/16.
 */
public class Login extends Utils {

    private String loginUsernameTextfieldID = "page_x002e_components_x002e_slingshot-login_x0023_default-username";
    private String loginPasswordTextfieldID = "page_x002e_components_x002e_slingshot-login_x0023_default-password";
    private String loginButtonID = "page_x002e_components_x002e_slingshot-login_x0023_default-submit-button";

    //@FindBy(id = "page_x002e_components_x002e_slingshot-login_x0023_default-username")
    //private WebElement loginUsernameTextfield = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")));

    //@FindBy(id = "page_x002e_components_x002e_slingshot-login_x0023_default-password")
    //private WebElement loginPasswordTextfield = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")));

    //@FindBy(id = "page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")
    //private WebElement loginButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")));

    public void loginToAlfresco()
    {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Integer.parseInt(timeout) / 1000);

        openSalesforceTab("alfrescoRepositoryTab");

        WebElement loginUsernameTextfield = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(loginUsernameTextfieldID)));
        WebElement loginPasswordTextfield = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(loginPasswordTextfieldID)));
        WebElement loginButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(loginButtonID)));

        TypeText(loginUsernameTextfield, GetProperty("credentials.properties","alfrescoUserName"));
        TypeText(loginPasswordTextfield, GetProperty("credentials.properties","alfrescoPassword"));
        loginButton.click();
    }

    private void openSalesforceTab(String tabToOpen){
        driver.get(GetProperty("salesforcePages.properties",tabToOpen));
    }

}
