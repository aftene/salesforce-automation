package org.alfresco.smoke;

import org.alfresco.helper.Utils;
import org.alfresco.po.common.Login;
import org.alfresco.po.salesforce.AlfrescoRepositoryTabList;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

/**
 * Created by p3700509 on 14/09/16.
 */
public class AlfrescoRepositoryTabTest
{

    private WebDriver webDriver;

    @Before
    public void setUp()
    {
        webDriver = new FirefoxDriver();
        webDriver.get(Utils.GetProperty("salesforcePages.properties","alfrescoRepositoryTab"));

        PageFactory.initElements(webDriver, Login.class).loginToAlfresco();
    }

    @Test
    public void TabTest(){

        AlfrescoRepositoryTabList tabListTest = PageFactory.initElements(webDriver, AlfrescoRepositoryTabList.class);

        tabListTest.getSitesTab().click();
        tabListTest.getSearchTab().click();
        tabListTest.getRepositoryTab().click();
        tabListTest.getPersonalFilesTab().click();
    }

    @AfterClass
    public void afterClass()
    {
        webDriver.close();
        webDriver.quit();
    }
}
