package org.alfresco.po.common;

import org.alfresco.helper.Utils;
import org.alfresco.po.salesforce.RepositoryTab;
import org.alfresco.po.salesforce.WorkPanel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by p3700509 on 06/09/16.
 */
public class Login extends Utils {

    private String timeout = "50000";
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(timeout) / 1000);

    private WebElement loginUsernameTextfield;

    private RepositoryTab repositoryTab;
    private WorkPanel workPanel;


    //@FindBy(id = "page_x002e_components_x002e_slingshot-login_x0023_default-username")


    //@FindBy(id = "page_x002e_components_x002e_slingshot-login_x0023_default-password")
    private WebElement loginPasswordTextfield;

    private WebElement loginButton;

    public Login()
    {
        driver.get("https://obiwan.alfresco.com/share/page/dp/ws/sfdc-tab");
        loginUsernameTextfield = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")));
        loginPasswordTextfield = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")));
        loginButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")));

        repositoryTab = PageFactory.initElements(driver, RepositoryTab.class);
        workPanel = PageFactory.initElements(driver, WorkPanel.class);

    }

    public WebElement getLoginUsernameTextfield()
    {
        return loginUsernameTextfield;
    }

    public WebElement getLoginPasswordTextfield()
    {
        return loginPasswordTextfield;
    }


    public void loginToAlfresco()
    {
        TypeText(loginUsernameTextfield, GetProperty("alfrescoUserName"));
        TypeText(loginPasswordTextfield, GetProperty("alfrescoPassword"));


        loginButton.click();

        repositoryTab.getTest().isDisplayed();

        repositoryTab.getRepositoryTab().click();
        workPanel.getCreateButton().click();
        workPanel.getCreateFolderButton().click();


    }

}
