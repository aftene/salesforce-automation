package org.alfresco.smoke;

import org.alfresco.helper.Utils;
import org.alfresco.po.common.LoginPO;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Set;

/**
 * Created by p3700471 on 14/09/16.
 */
public class TestRunner {

    private WebDriver webDriver;

    @BeforeClass
    public void beforeClass()
    {
        webDriver = new FirefoxDriver();
        webDriver.get(Utils.GetProperty("salesforcePages.properties","alfrescoRepositoryTab"));
    }

    @Test
    public void loginTest()
    {
        //initialize login page objects
        LoginPO loginPage = PageFactory.initElements(webDriver, LoginPO.class);

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
