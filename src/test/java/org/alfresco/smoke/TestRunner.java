package org.alfresco.smoke;

import static org.alfresco.helper.Utils.getProperty;
import org.alfresco.po.common.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by p3700471 on 14/09/16.
 */
public class TestRunner {

    private WebDriver webDriver;

    @BeforeClass
    public void setUp()
    {
        webDriver = new FirefoxDriver();
        webDriver.get(getProperty("salesforcePages.properties","alfrescoRepositoryTab"));
    }

    @Test
    public void loginTest()
    {
        //initialize login page objects
        Login loginPage = PageFactory.initElements(webDriver, Login.class);

        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickLoginButton();

    }

    @AfterClass
    public void afterClass()
    {
        webDriver.close();
        webDriver.quit();
    }


}
